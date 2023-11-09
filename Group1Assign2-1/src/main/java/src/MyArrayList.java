/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.Iterator;

public class MyArrayList<E> implements ListADT<E> {
    private static final int INITIAL_CAPACITY = 10;
    private E[] elements;
    private int size;

    public MyArrayList() {
        elements = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        // Implement this method.
        return 0; // Replace with the actual implementation.
    }

    @Override
    public void clear() {
        // Implement this method.
    }

    @Override
    public boolean add(int index, E toAdd) {
        // Implement this method.
        return false;
    }

    @Override
    public boolean add(E toAdd) {
        // Implement this method.
        return false;
    }

    @Override
    public boolean addAll(ListADT<? extends E> toAdd) {
        // Implement this method.
        return false;
    }

    @Override
    public E get(int index) {
        // Implement this method.
        return null;
    }

    @Override
    public E remove(int index) {
        // Implement this method.
        return null;
    }

    @Override
    public E remove(E toRemove) {
        // Implement this method.
        return null;
    }

    @Override
    public E set(int index, E toChange) {
        // Implement this method.
        return null;
    }

    @Override
    public boolean isEmpty() {
        // Implement this method.
        return false;
    }

    @Override
    public boolean contains(E toFind) {
        // Implement this method.
        return false;
    }

    @Override
    public E[] toArray(E[] toHold) {
        // Implement this method.
        return null;
    }

    @Override
    public Object[] toArray() {
        // Implement this method.
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        // Implement this method.
        return null;
    }
}
