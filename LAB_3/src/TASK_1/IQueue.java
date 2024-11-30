package TASK_1;

public interface IQueue<T> {
    void enqueue(T item);
    T dequeue();
    boolean isEmpty();
    int size();
    T peek();
}