package org.apache.zookeeper;
import org.apache.zookeeper.server.quorum.FastLeaderElection;
import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer;
import org.apache.zookeeper.server.quorum.QuorumPeer.Vote;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class FastLeaderElectionTest {

    private FastLeaderElection election;

    @BeforeEach
    void setUp() {
        QuorumPeer self = new QuorumPeer();
        self.setId(1);
        self.setQuorumPeers(new HashMap<>());
        election = new FastLeaderElection(self);
    }

    @Test
    void testTotalOrderPredicate_epochGreaterWins() {
        assertTrue(election.totalOrderPredicate(1, 1, 3, 2, 2, 2));
    }

    @Test
    void testTotalOrderPredicate_zxidGreaterWins() {
        assertTrue(election.totalOrderPredicate(1, 10, 2, 2, 9, 2));
    }

    @Test
    void testTotalOrderPredicate_idGreaterWins() {
        assertTrue(election.totalOrderPredicate(5, 5, 1, 4, 5, 1));
    }

    @Test
    void testTotalOrderPredicate_epochLowerLoses() {
        assertFalse(election.totalOrderPredicate(1, 10, 1, 2, 9, 2));
    }

    @Test
    void testGetVoteTracker_quorumReached() {
        Vote vote = new Vote(1, 10, 1);
        Map<Long, Vote> votes = new HashMap<>();
        votes.put(1L, vote);
        votes.put(2L, vote);
        votes.put(3L, vote);
        assertTrue(election.getVoteTracker(votes, vote).hasAllQuorums());
    }

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

    @Test
    void testGetVote_returnsVote() {
        Vote vote = new Vote(1, 10, 2);
        election.setVote(vote);
        assertEquals(vote, election.getVote());
    }

    @Test
    void testGetLogicalClock_initialIsZero() {
        assertEquals(0, election.getLogicalClock());
    }

    @Test
    void testCheckLeader_withQuorum() {
        Map<Long, Vote> recvVotes = new HashMap<>();
        Vote vote = new Vote(1, 10, 2);
        recvVotes.put(1L, vote);
        recvVotes.put(2L, vote);
        recvVotes.put(3L, vote);

        Map<Long, QuorumVerifier> qvMap = new HashMap<>();
        qvMap.put(0L, new QuorumMaj(3));

        assertTrue(election.checkLeader(recvVotes, vote, qvMap, 0));
    }

    @Test
    void testCheckLeader_withoutQuorum() {
        Map<Long, Vote> recvVotes = new HashMap<>();
        Vote vote = new Vote(1, 10, 2);
        recvVotes.put(1L, vote);

        Map<Long, QuorumVerifier> qvMap = new HashMap<>();
        qvMap.put(0L, new QuorumMaj(3));

        assertFalse(election.checkLeader(recvVotes, vote, qvMap, 0));
    }

}