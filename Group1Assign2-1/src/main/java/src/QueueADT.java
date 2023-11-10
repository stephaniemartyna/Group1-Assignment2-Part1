/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package src;

/**
 * An interface representing a basic queue data structure.
 * @param <E> the type of elements in the queue.
 */
public interface QueueADT<E> {

    /**
     * Enqueues (adds) an element to the back of the queue.
     * 
     * @param item the element to be enqueued.
     * @throws NullPointerException if item is null.
     */
    void enqueue(E item);

    /**
     * Dequeues (removes and returns) the element from the front of the queue.
     * 
     * @return the element from the front of the queue.
     * @throws java.util.NoSuchElementException if the queue is empty.
     */
    E dequeue();

    /**
     * Retrieves, but does not remove, the element from the front of the queue.
     * 
     * @return the element from the front of the queue.
     * @throws java.util.NoSuchElementException if the queue is empty.
     */
    E peek();

    /**
     * Returns the number of elements in the queue.
     * 
     * @return the number of elements in the queue.
     */
    int size();

    /**
     * Checks if the queue is empty.
     * 
     * @return true if the queue is empty, false otherwise.
     */
    boolean isEmpty();
}