package TASK_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTests {

    private LinkedListQueue<Integer> llQueue;
    private VectorQueue<String> vectorQueue;
    private ArrayQueue<Character> arrayQueue;

    @BeforeEach
    public void setUp() {
        llQueue = new LinkedListQueue<>();
        vectorQueue = new VectorQueue<>();
        arrayQueue = new ArrayQueue<>();
    }

    @Test
    public void testLinkedListQueue() {
        llQueue.enqueue(1);
        llQueue.enqueue(2);
        llQueue.enqueue(3);

        assertEquals(1, llQueue.peek(), "Peek should return 1");
        assertEquals(1, llQueue.dequeue(), "Dequeue should return 1");
        assertEquals(2, llQueue.peek(), "Peek should return 2 after dequeue");
        assertFalse(llQueue.isEmpty(), "Queue should not be empty");
        assertEquals(2, llQueue.dequeue(), "Dequeue should return 2");
        assertEquals(3, llQueue.dequeue(), "Dequeue should return 3");
        assertTrue(llQueue.isEmpty(), "Queue should be empty after all items are dequeued");
    }

    @Test
    public void testVectorQueue() {
        vectorQueue.enqueue("apple");
        vectorQueue.enqueue("banana");
        vectorQueue.enqueue("cherry");

        assertEquals("apple", vectorQueue.peek(), "Peek should return 'apple'");
        assertEquals("apple", vectorQueue.dequeue(), "Dequeue should return 'apple'");
        assertEquals("banana", vectorQueue.peek(), "Peek should return 'banana'");
        assertFalse(vectorQueue.isEmpty(), "Queue should not be empty");
        assertEquals("banana", vectorQueue.dequeue(), "Dequeue should return 'banana'");
        assertEquals("cherry", vectorQueue.dequeue(), "Dequeue should return 'cherry'");
        assertTrue(vectorQueue.isEmpty(), "Queue should be empty after all items are dequeued");
    }

    @Test
    public void testArrayQueue() {
        arrayQueue.enqueue('A');
        arrayQueue.enqueue('B');
        arrayQueue.enqueue('C');

        assertEquals('A', arrayQueue.peek(), "Peek should return 'A'");
        assertEquals('A', arrayQueue.dequeue(), "Dequeue should return 'A'");
        assertEquals('B', arrayQueue.peek(), "Peek should return 'B'");
        assertFalse(arrayQueue.isEmpty(), "Queue should not be empty");
        assertEquals('B', arrayQueue.dequeue(), "Dequeue should return 'B'");
        assertEquals('C', arrayQueue.dequeue(), "Dequeue should return 'C'");
        assertTrue(arrayQueue.isEmpty(), "Queue should be empty after all items are dequeued");
    }
}
