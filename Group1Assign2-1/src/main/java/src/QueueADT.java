/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package src;
/**
 * This interface defines the Queue ADT (Abstract Data Type).
 *
 * @param <E> The type of elements stored in the queue.
 */
public interface QueueADT<E> {
    /**
     * Adds an element to the rear of the queue.
     *
     * @param element The element to be added.
     * @throws NullPointerException if the provided element is null.
     */
    void enqueue(E element);

    /**
     * Removes and returns the element from the front of the queue.
     *
     * @return The element at the front of the queue.
     * @throws EmptyQueueException if the queue is empty.
     */
    E dequeue();

    /**
     * Returns the element at the front of the queue without removing it.
     *
     * @return The element at the front of the queue.
     * @throws EmptyQueueException if the queue is empty.
     */
    E peek();

    /**
     * Checks if the queue is empty.
     *
     * @return True if the queue is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the queue.
     *
     * @return The size of the queue.
     */
    int size();
}
