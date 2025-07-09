package org.apache.zookeeper.randoop2;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = org.apache.zookeeper.server.quorum.FastLeaderElection.Notification.CURRENTVERSION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.zookeeper.server.quorum.FastLeaderElection.Notification notification0 = new org.apache.zookeeper.server.quorum.FastLeaderElection.Notification();
        Class<?> wildcardClass1 = notification0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        String str0 = org.apache.zookeeper.server.quorum.FastLeaderElection.MAX_NOTIFICATION_INTERVAL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "zookeeper.fastleader.maxNotificationInterval" + "'", str0, "zookeeper.fastleader.maxNotificationInterval");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.zookeeper.server.quorum.QuorumPeer quorumPeer0 = null;
        org.apache.zookeeper.server.quorum.QuorumCnxManager quorumCnxManager1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.FastLeaderElection fastLeaderElection2 = new org.apache.zookeeper.server.quorum.FastLeaderElection(quorumPeer0, quorumCnxManager1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 'a', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 100L, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        String str0 = org.apache.zookeeper.server.quorum.FastLeaderElection.MIN_NOTIFICATION_INTERVAL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "zookeeper.fastleader.minNotificationInterval" + "'", str0, "zookeeper.fastleader.minNotificationInterval");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 0L, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 1L, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) '#', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 10L, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (-1L), (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (-1), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 0L, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 100L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (-1), (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) -1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 'a', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (-1), (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) -1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) -1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) ' ', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 0L, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) -1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 0L, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) -1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (-1L), 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (-1), 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) ' ', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) '4', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 2, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (-1L), (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) -1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 0L, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) '#', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 100L, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 0L, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (-1), (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 0L, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) ' ', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) -1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) ' ', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (-1), (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) ' ', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) ' ', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) '4', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 10L, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 10L, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) -1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) -1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) '4', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (-1), (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 1L, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 1, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 2, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 2, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 2, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 0L, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) '#', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (-1), (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (-1L), (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 2, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (short) 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 100, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) '4', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) -1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 0L, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, 0L, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 2, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (-1L), (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (byte) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.Map<Long, org.apache.zookeeper.server.quorum.Vote> longMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.zookeeper.server.quorum.FastLeaderElection.checkLeader(longMap0, (long) (-1), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.quorum.QuorumPeer.getMyId()\" because \"org.apache.zookeeper.server.quorum.FastLeaderElection.self\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }
}

