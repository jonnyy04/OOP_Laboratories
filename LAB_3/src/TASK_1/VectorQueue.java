package TASK_1;

import java.util.Vector;

public class VectorQueue<T> implements IQueue<T> {
    private Vector<T> queue;

    public VectorQueue() {
        queue = new Vector<>();
    }

    @Override
    public void enqueue(T item) {
        queue.add(item);
    }

    @Override
    public T peek() {
        return queue.isEmpty() ? null : queue.get(0);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        return queue.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }
}