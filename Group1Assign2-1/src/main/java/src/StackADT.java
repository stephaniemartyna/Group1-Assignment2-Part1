/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package src;
/**
 * 
 *
 * @param <E>
 */
public interface StackADT<E> {
  
    void push(E element);

    
    E pop();

    
    E peek();

    
    boolean isEmpty();

    
    int size();
}

