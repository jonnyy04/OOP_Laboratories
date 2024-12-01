package TASK_1;

public class Main {
    public static void main(String[] args) {

        // Test TASK_1.LinkedListQueue with Integer
        System.out.println("Testing TASK_1.LinkedListQueue with Integer:");
        LinkedListQueue<Integer> llQueue = new LinkedListQueue<>();
        llQueue.enqueue(1);
        llQueue.enqueue(2);
        llQueue.enqueue(3);
        System.out.println("Peek: " + llQueue.peek()); // Expected: 1
        System.out.println("Dequeue: " + llQueue.dequeue()); // Expected: 1
        System.out.println("Peek after dequeue: " + llQueue.peek()); // Expected: 2
        System.out.println("Is Empty: " + llQueue.isEmpty()); // Expected: false
        System.out.println("Dequeue all: " + llQueue.dequeue() + ", " + llQueue.dequeue()); // Expected: 2, 3
        System.out.println("Is Empty after clearing: " + llQueue.isEmpty()); // Expected: true
        System.out.println();


        // Test TASK_1.VectorQueue with String
        System.out.println("Testing TASK_1.VectorQueue with String:");
        VectorQueue<String> vectorQueue = new VectorQueue<>();
        vectorQueue.enqueue("apple");
        vectorQueue.enqueue("banana");
        vectorQueue.enqueue("cherry");
        System.out.println("Peek: " + vectorQueue.peek()); // Expected: "apple"
        System.out.println("Dequeue: " + vectorQueue.dequeue()); // Expected: "apple"
        System.out.println("Peek after dequeue: " + vectorQueue.peek()); // Expected: "banana"
        System.out.println("Is Empty: " + vectorQueue.isEmpty()); // Expected: false
        System.out.println("Dequeue all: " + vectorQueue.dequeue() + ", " + vectorQueue.dequeue()); // Expected: "banana", "cherry"
        System.out.println("Is Empty after clearing: " + vectorQueue.isEmpty()); // Expected: true
        System.out.println();


        // Test TASK_1.ArrayQueue with Character
        System.out.println("Testing TASK_1.ArrayQueue with Character:");
        ArrayQueue<Character> arrayQueue = new ArrayQueue<>();
        arrayQueue.enqueue('A');
        arrayQueue.enqueue('B');
        arrayQueue.enqueue('C');
        System.out.println("Peek: " + arrayQueue.peek()); // Expected: 'A'
        System.out.println("Dequeue: " + arrayQueue.dequeue()); // Expected: 'A'
        System.out.println("Peek after dequeue: " + arrayQueue.peek()); // Expected: 'B'
        System.out.println("Is Empty: " + arrayQueue.isEmpty()); // Expected: false
        System.out.println("Dequeue all: " + arrayQueue.dequeue() + ", " + arrayQueue.dequeue()); // Expected: 'B', 'C'
        System.out.println("Is Empty after clearing: " + arrayQueue.isEmpty()); // Expected: true
    }
}