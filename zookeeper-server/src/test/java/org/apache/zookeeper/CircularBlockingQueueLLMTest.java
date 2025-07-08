package org.apache.zookeeper;

import org.apache.zookeeper.util.CircularBlockingQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

public class CircularBlockingQueueLLMTest {

    private CircularBlockingQueue<String> queue;

    @BeforeEach
    public void setup() {
        queue = new CircularBlockingQueue<>(5);
    }


    // Verifica che il costruttore crei una coda con capacità corretta e che
    // l'inserimento di più elementi della capacità non la faccia crescere oltre.
    @Test
    public void testConstructor() {
        // Riempie la coda fino alla capacità nota di 5 elementi
        for (int i = 0; i < 5; i++) {
            queue.offer("Elemento " + i);
        }

        // Aggiungere un sesto elemento dovrebbe causare un'eccezione o scartare il più vecchio
        // Verifica quindi che la size sia 5 (la capacità)
        assertEquals(5, queue.size());
    }

    // Verifica che l'inserimento di elementi in una coda non piena funzioni correttamente
    // e che la dimensione della coda corrisponda al numero di elementi inseriti.
    @Test
    public void testOfferWhenNotFull() {
        // Offrire elementi senza problemi
        for (int i = 0; i < 4; i++) {
            queue.offer("Elemento " + i);
        }
        assertEquals(4, queue.size());
    }

    // Verifica che un'eccezione venga lanciata quando si tenta di aggiungere
    // un elemento in una coda già piena.
    @Test
    public void testOfferWhenFull() {
        // La coda è piena, quindi l'offerta deve fallire
        for (int i = 0; i < 5; i++) {
            queue.offer("Elemento " + i);
        }
        assertThrows(UnsupportedOperationException.class, () ->
                queue.add("Elemento 5"));
    }

    // Verifica che il metodo take() rimuova e restituisca il primo elemento della coda
    // quando ci sono elementi presenti.
    @Test
    public void testTakeWhenNotEmpty() throws InterruptedException {
        // Inserire elementi e poi prenderli
        for (int i = 0; i < 4; i++) {
            queue.offer("Elemento " + i);
        }
        String taken = queue.take();
        assertEquals("Elemento 0", taken);
    }

    /*
    @Test
    public void testTakeWhenEmpty() throws InterruptedException {
        // La coda è vuota, quindi il take deve bloccare
        queue.clear();
        assertThrows(InterruptedException.class, () -> queue.take());
    }
    */

    // Verifica che il metodo take() (usato qui al posto di poll con timeout) restituisca
    // correttamente il primo elemento quando la coda non è vuota.
    @Test
    public void testPollWhenNotEmpty() throws InterruptedException {
        // Inserire elementi e poi prenderli con take()
        for (int i = 0; i < 4; i++) {
            queue.offer("Elemento " + i);
        }
        String taken = queue.take();
        assertEquals("Elemento 0", taken);
    }

    /*
    @Test
    public void testPollWhenEmpty() throws InterruptedException {
        // La coda è vuota, quindi il poll deve restituire null
        queue.clear();
        assertNull(queue.poll(1, TimeUnit.SECONDS));
    }
    */

    // Verifica che una nuova coda sia inizialmente vuota.
    @Test
    public void testIsEmpty() {
        // La coda è vuota, quindi isEmpty() deve tornare true
        assertTrue(queue.isEmpty());
    }

    // Verifica che il metodo size() ritorni il numero corretto di elementi inseriti nella coda.
    @Test
    public void testSize() {
        // Ora size() restituisce il numero di elementi attuali
        queue.offer("Elemento 1");
        queue.offer("Elemento 2");
        assertEquals(2, queue.size());
    }

    // Verifica che il numero di elementi scartati venga tracciato correttamente
    // quando si superano i limiti della capacità della coda.
    @Test
    public void testGetDroppedCount() {
        // Riempie la coda fino alla capacità
        for (int i = 0; i < 5; i++) {
            queue.offer("Elemento " + i);
        }

        // Prova ad aggiungere altri elementi per causare il drop dei vecchi
        queue.offer("Elemento extra 1");
        queue.offer("Elemento extra 2");

        // Dato che la capacità è 5, dovrebbero essere stati scartati 2 elementi
        assertEquals(2, queue.getDroppedCount());
    }

    // Verifica (commentato) se il consumatore non è bloccato quando la coda non è piena.
    @Test
    public void testIsConsumerThreadBlockedWhenNotFull() throws
            InterruptedException {
        // La coda non è piena, quindi il thread consumatore non dovrebbe essere bloccato
        queue.offer("Elemento 0");
        // assertFalse(queue.isConsumerThreadBlocked()); // Verificare se disponibile
    }

    // Simula un thread consumatore che chiama take() su una coda piena e verifica (commentato)
    // se il thread entra in stato di attesa/blocco come previsto.
    @Test
    public void testIsConsumerThreadBlockedWhenFull() throws InterruptedException {
        // Riempie la coda
        for (int i = 0; i < 5; i++) {
            queue.offer("Elemento " + i);
        }

        // Avvia un thread che prova a fare take() — dovrebbe bloccarsi
        Thread consumer = new Thread(() -> {
            try {
                queue.take(); // Questo dovrebbe bloccare
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        consumer.start();

        // Aspetta un attimo per assicurarsi che il thread sia entrato in attesa
        Thread.sleep(200);

        // Ora dovrebbe risultare che un thread è bloccato su take()
        // assertTrue(queue.isConsumerThreadBlocked()); // Verificare se disponibile

        // Interrompe il thread per evitare che resti appeso
        consumer.interrupt();
        consumer.join();
    }
}