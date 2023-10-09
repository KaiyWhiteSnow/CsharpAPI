package Queue;
import java.util.LinkedList;

/**
 * A generic Queue implementation using a linked list data structure.
 *
 * @param <T> The type of elements stored in the queue.
 */
public class Queue<T> {

    private LinkedList<T> queue;

    /**
     * Initializes an empty queue.
     */
    public Queue() {
        queue = new LinkedList<>();
    }

    /**
     * Adds an item to the end of the queue.
     *
     * @param item The item to enqueue.
     */
    public void Enqueue(T item) {
        queue.addLast(item);
    }

    /**
     * Removes and returns the item at the front of the queue.
     *
     * @return The item removed from the queue.
     * @throws IllegalStateException if the queue is empty.
     */
    public T Dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Returns the number of elements in the queue.
     *
     * @return The number of elements in the queue.
     */
    public int Count() {
        return queue.size();
    }

    /**
     * Returns a string representation of the queue.
     *
     * @return A string containing the elements of the queue.
     */
    @Override
    public String toString() {
        return queue.toString();
    }
}
