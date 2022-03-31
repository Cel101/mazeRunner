/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import DataStructures.EmptyCollectionException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marce
 */
public class ArrayListStackTest {

    public ArrayListStackTest() {
    }

    /**
     * Test of push method, of class ArrayListStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object element = null;                  //Create element to be result.
        ArrayListStack instance = new ArrayListStack(); //Create stack.
        assertEquals(0, instance.size());       //Check the stack is empty.
        instance.push(element);                 //Add element to stack.
        assertEquals(1, instance.size());       //Check the stack is no longer empty.

    }

    /**
     * Test of pop method, of class ArrayListStack.
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        ArrayListStack instance = new ArrayListStack();
        Object expResult = null;                        //Create object of desired result
        Object element = null;                          //Create element to be inseted
        instance.push(element);                         //Insert element
        Object result = instance.pop();                 //Create element to take the popped element
        assertEquals(expResult, result);                //Assert they are the same
        assertEquals(0, instance.size());               //Make sure the object is not still in the list

    }

    @Test(expected = EmptyCollectionException.class)
    public void testPop2() throws Exception {
        ArrayListStack instance = new ArrayListStack(); //Create empty instance.
        instance.pop();                                 //Pop on an empty instance to test exception. 
    }

    /**
     * Test of peek method, of class ArrayListStack.
     */
    @Test
    public void testPeek() throws Exception {
        System.out.println("peek");
        ArrayListStack instance = new ArrayListStack();
        Object element = null;                      //Create null object to be inserted
        Object expResult = null;                    //Create object to compare
        instance.push(element);                     //Add element to list
        Object result = instance.peek();            //Call method to a object
        assertEquals(expResult, result);            //Make sure they are the same
        assertEquals(1, instance.size());           //Make sure the object is still in list

    }

    @Test(expected = EmptyCollectionException.class)
    public void testPeek2() throws Exception {
        ArrayListStack instance = new ArrayListStack(); //Create empty instance.
        instance.peek();                            // Call peek on empty instance to test exception.

    }

    /**
     * Test of isEmpty method, of class ArrayListStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayListStack instance = new ArrayListStack();
        Object element = null;                      //Create object to test
        assertTrue(instance.isEmpty());             //Test the list is empty
        instance.push(element);                     //Add an element
        assertFalse(instance.isEmpty());            //Test it is not empty
    }

    /**
     * Test of size method, of class ArrayListStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayListStack instance = new ArrayListStack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

}
