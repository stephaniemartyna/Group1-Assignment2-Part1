/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package src;

/**
 * An interface representing a basic stack data structure.
 * @param <E> the type of elements in the stack.
 */
public interface StackADT<E> {

    /**
     * Pushes an element onto the top of the stack.
     * 
     * @param item the element to be pushed onto the stack.
     * @throws NullPointerException if item is null.
     */
    void push(E item);

    /**
     * Removes and returns the element at the top of the stack.
     * 
     * @return the element at the top of the stack.
     * @throws java.util.EmptyStackException if the stack is empty.
     */
    E pop();

    /**
     * Retrieves, but does not remove, the element at the top of the stack.
     * 
     * @return the element at the top of the stack.
     * @throws java.util.EmptyStackException if the stack is empty.
     */
    E peek();

    /**
     * Returns the number of elements in the stack.
     * 
     * @return the number of elements in the stack.
     */
    int size();

    /**
     * Checks if the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise.
     */
    boolean isEmpty();
}

