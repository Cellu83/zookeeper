package org.apache.zookeeper;
import org.apache.zookeeper.server.quorum.*;
import org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer;
import org.apache.zookeeper.server.quorum.flexible.QuorumMaj;
import org.apache.zookeeper.server.quorum.flexible.QuorumVerifier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.zookeeper.server.quorum.Vote;
import javax.security.sasl.SaslException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

public class FastLeaderElectionTest {

    // Stub per testare funzionalità non esposte direttamente da FastLeaderElection
    private static class FastLeaderElectionStub extends FastLeaderElection {
        private Vote currentVote;

        public FastLeaderElectionStub(QuorumPeer self, QuorumCnxManager manager) {
            super(self, manager);
        }

        public void setVote(Vote vote) {
            this.currentVote = vote;
        }

        @Override
        public Vote getVote() {
            return currentVote;
        }
    }

    private FastLeaderElectionStub election;

    @BeforeEach
    void setUp() throws SaslException, QuorumPeerConfig.ConfigException {
        QuorumPeer self = new QuorumPeer();
        self.setId(1);
        Properties props = new Properties();
        props.setProperty("server.1", "localhost:2888:3888");
        props.setProperty("server.2", "localhost:2889:3889");
        props.setProperty("server.3", "localhost:2890:3890");
        self.setQuorumVerifier(new QuorumMaj(props), false);
        election = new FastLeaderElectionStub(self, null);
    }

    // Verifica che un voto con un epoch maggiore sia considerato superiore in una comparazione
    @Test
    void testTotalOrderPredicate_epochGreaterWins() {
        assertTrue(election.totalOrderPredicate(1, 1, 3, 2, 2, 2));
    }

    // Verifica che a parità di epoch, un voto con zxid maggiore sia considerato superiore
    @Test
    void testTotalOrderPredicate_zxidGreaterWins() {
        assertTrue(election.totalOrderPredicate(1, 10, 2, 2, 9, 2));
    }

    // Verifica che a parità di epoch e zxid, un voto con ID maggiore sia considerato superiore
    @Test
    void testTotalOrderPredicate_idGreaterWins() {
        assertTrue(election.totalOrderPredicate(5, 5, 1, 4, 5, 1));
    }

    // Verifica che un voto con epoch inferiore venga considerato inferiore in una comparazione
    @Test
    void testTotalOrderPredicate_epochLowerLoses() {
        assertFalse(election.totalOrderPredicate(1, 10, 1, 2, 9, 2));
    }

    // Verifica che getVoteTracker rilevi correttamente il raggiungimento del quorum quando tutti i voti coincidono
    @Test
    void testGetVoteTracker_quorumReached() {
        Vote vote = new Vote(1, 10, 1);
        Map<Long, Vote> votes = new HashMap<>();
        votes.put(1L, vote);
        votes.put(2L, vote);
        votes.put(3L, vote);
        assertTrue(election.getVoteTracker(votes, vote).hasAllQuorums());
    }

    // Verifica che getVoteTracker non segnali il quorum quando i voti sono discordanti
    @Test
    void testGetVoteTracker_quorumNotReached() {
        Vote vote1 = new Vote(1, 10, 1);
        Vote vote2 = new Vote(2, 9, 1);
        Map<Long, Vote> votes = new HashMap<>();
        votes.put(1L, vote1);
        votes.put(2L, vote2);
        votes.put(3L, vote2);
        assertFalse(election.getVoteTracker(votes, vote1).hasAllQuorums());
    }

    // Verifica che il metodo getVote restituisca correttamente il voto impostato con setVote
    @Test
    void testGetVote_returnsVote() {
        Vote vote = new Vote(1, 10, 2);
        election.setVote(vote);
        assertEquals(vote, election.getVote());
    }

    // Verifica che il logical clock iniziale sia impostato a 0
    @Test
    void testGetLogicalClock_initialIsZero() {
        assertEquals(0, election.getLogicalClock());
    }

    // Verifica che il metodo checkLeader confermi il leader quando il quorum è raggiunto
    @Test
    void testCheckLeader_withQuorum() {
        Map<Long, Vote> recvVotes = new HashMap<>();
        Vote vote = new Vote(1, 10, 2);
        recvVotes.put(1L, vote);
        recvVotes.put(2L, vote);
        recvVotes.put(3L, vote);

        Map<Long, QuorumVerifier> qvMap = new HashMap<>();
        Map<Long, QuorumServer> servers = new HashMap<>();
        servers.put(1L, new QuorumServer(1L, null, null));
        servers.put(2L, new QuorumServer(2L, null, null));
        servers.put(3L, new QuorumServer(3L, null, null));
        qvMap.put(0L, new QuorumMaj(servers));

        assertTrue(election.checkLeader(recvVotes, vote.getId(), 0L));
    }

    // Verifica che il metodo checkLeader non confermi il leader quando non è raggiunto il quorum
    @Test
    void testCheckLeader_withoutQuorum() {
        Map<Long, Vote> recvVotes = new HashMap<>();
        Vote vote = new Vote(1, 10, 2);
        recvVotes.put(1L, vote);

        Map<Long, QuorumVerifier> qvMap = new HashMap<>();
        Map<Long, QuorumServer> servers = new HashMap<>();
        servers.put(1L, new QuorumServer(1L, null, null));
        servers.put(2L, new QuorumServer(2L, null, null));
        servers.put(3L, new QuorumServer(3L, null, null));
        qvMap.put(0L, new QuorumMaj(servers));

        assertFalse(election.checkLeader(recvVotes, 0L, vote.getId()));
    }

}