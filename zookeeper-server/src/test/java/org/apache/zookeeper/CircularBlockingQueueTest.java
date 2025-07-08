package org.apache.zookeeper;

import org.apache.zookeeper.util.CircularBlockingQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class CircularBlockingQueueTest {

    private CircularBlockingQueue<String> queue;

    @BeforeEach
    void setUp() {
        queue = new CircularBlockingQueue<>(3);
    }

    // Verifica che quando la coda è piena, un nuovo elemento sovrascriva quello più vecchio.
    // Inserisce 4 elementi in una coda con capacità 3 e verifica che il primo venga rimosso.
    @Test
    void testOfferOverwriteBehavior() throws InterruptedException {
        assertTrue(queue.offer("A"));
        assertTrue(queue.offer("B"));
        assertTrue(queue.offer("C"));
        assertTrue(queue.offer("D")); // Should overwrite "A"

        assertEquals("B", queue.take());
        assertEquals("C", queue.take());
        assertEquals("D", queue.take());
    }

    // Verifica il comportamento di poll con timeout.
    // Inserisce due elementi e verifica che vengano estratti correttamente, seguito da un timeout.
    @Test
    void testPollElement() {
        queue.offer("A");
        queue.offer("B");
        try {
            assertEquals("A", queue.poll(100, TimeUnit.MILLISECONDS));
            assertEquals("B", queue.poll(100, TimeUnit.MILLISECONDS));
            assertNull(queue.poll(100, TimeUnit.MILLISECONDS)); // Should time out
        } catch (InterruptedException e) {
            fail("Interrupted during poll");
        }
    }

    // Verifica che size() riporti il numero corretto di elementi nella coda,
    // anche quando si verifica un'operazione di overwrite.
    @Test
    void testSizeAndCapacity() {
        assertEquals(0, queue.size());
        queue.offer("X");
        assertEquals(1, queue.size());
        queue.offer("Y");
        queue.offer("Z");
        assertEquals(3, queue.size());
        queue.offer("Overflow"); // Should overwrite the first
        assertEquals(3, queue.size());
    }

    // Verifica che offer funzioni correttamente quando la coda è piena,
    // e che l'elemento più vecchio venga sovrascritto.
    // Poi verifica che gli elementi rimasti siano quelli attesi.
    @Test
    void testOfferWithTimeout() throws InterruptedException {
        assertTrue(queue.offer("E"));
        assertTrue(queue.offer("F"));
        assertTrue(queue.offer("G"));

        // L'elemento "H" dovrebbe causare l'overflow e sovrascrivere "E"
        assertTrue(queue.offer("H"));

        try {
            assertEquals("F", queue.take());
            assertEquals("G", queue.take());
            assertEquals("H", queue.take());
        } catch (InterruptedException e) {
            fail("Test interrupted");
        }
    }

    // Verifica che poll restituisca l'elemento corretto e poi null se la coda è vuota,
    // usando un timeout.
    @Test
    void testPollWithTimeout() throws InterruptedException {
        queue.offer("M");
        assertEquals("M", queue.poll(100, TimeUnit.MILLISECONDS));
        assertNull(queue.poll(100, TimeUnit.MILLISECONDS)); // Should time out
    }

    // Verifica il metodo isEmpty()
    @Test
    void testIsEmpty() throws InterruptedException {
        assertTrue(queue.isEmpty(), "Queue should be empty initially");
        queue.offer("A");
        assertFalse(queue.isEmpty(), "Queue should not be empty after adding an element");
        queue.take(); // remove the only element
        assertTrue(queue.isEmpty(), "Queue should be empty after removing the only element");
    }

    // Verifica il metodo isConsumerThreadBlocked()
    @Test
    void testIsConsumerThreadBlocked() throws InterruptedException {
        // Start a thread to take from empty queue
        Thread taker = new Thread(() -> {
            try {
                queue.take(); // This should block
            } catch (InterruptedException ignored) {}
        });

        taker.start();
        // Sleep a bit to ensure thread is waiting on take()
        Thread.sleep(100);
        assertTrue(queue.isConsumerThreadBlocked(), "Consumer thread should be blocked");

        // Add an element to unblock the consumer
        queue.offer("X");

        // Allow thread to finish
        taker.join();
        assertFalse(queue.isConsumerThreadBlocked(), "Consumer thread should not be blocked anymore");
    }

}
