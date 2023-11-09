package src;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class MyArrayListTests {

    private MyArrayList<Integer> myArrayList;

    @Test
    void testInitialSize() {
        // Test that the initial size is 0.
        assertEquals(0, myArrayList.size());
    }

    @Test
    void testAddElement() {
        // Add an element to the list.
        myArrayList.add(42);
        
        // Test that the size is 1.
        assertEquals(1, myArrayList.size());
        
        // Test that the list contains the added element.
        assertTrue(myArrayList.contains(42));
    }

    @Test
    void testRemoveElement() {
        // Add an element to the list.
        myArrayList.add(10);

        // Remove the element.
        myArrayList.remove(10);

        // Test that the size is 0 after removal.
        assertEquals(0, myArrayList.size());

        // Test that the list no longer contains the removed element.
        assertFalse(myArrayList.contains(10));
    }

    @Test
    void testGetElementAtIndex() {
        // Add elements to the list.
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        // Test getting an element at a specific index.
        assertEquals(2, myArrayList.get(1));
    }

    @Test
    void testOutOfBoundsIndex() {
        // Try to access an out-of-bounds index.
        assertThrows(IndexOutOfBoundsException.class, () -> myArrayList.get(10));
    }

    // Add more tests for other methods and edge cases.

}

