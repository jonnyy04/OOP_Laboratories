package TASK_1;

public class ArrayQueue<T> implements IQueue<T> {
    private Object[] queue;
    private int front;
    private int rear;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public ArrayQueue() {
        queue = new Object[INITIAL_CAPACITY];
        front = rear = size = 0;
    }

    @Override
    public void enqueue(T item) {
        if (size == queue.length) {
            resize();
        }
        queue[rear] = item;
        rear = (rear + 1) % queue.length;
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        @SuppressWarnings("unchecked")
        T data = (T) queue[front];
        front = (front + 1) % queue.length;
        size--;
        return data;
    }

    @Override
    public T peek() {
        return size == 0 ? null : (T) queue[0];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void resize() {
        int newCapacity = queue.length * 2;
        Object[] newQueue = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[(front + i) % queue.length];
        }
        queue = newQueue;
        front = 0;
        rear = size;
    }
}
