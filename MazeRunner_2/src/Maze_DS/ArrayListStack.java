/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import DataStructures.EmptyCollectionException;
import DataStructures.StackADT;
import java.util.ArrayList;

/**
 *
 * @author Marcel Colón Date: 11/06/2020
 * @param <T> Used as generic object
 */
public class ArrayListStack<T> implements StackADT<T> {

    private ArrayList<T> list;
    int eleTracker;

    /**
     *
     */
    public ArrayListStack() {
        this.list = new ArrayList<T>();
        this.eleTracker = 0;
    }

    /**
     * Description: Method to add elements to the top of the stack.
     *
     * @param element Argument passed to be added to list
     */
    @Override
    public void push(T element) {
        list.add(element);
        eleTracker++;
    }

    /**
     * Description: Takes object out of stack from the top and returns it.
     *
     * @return Returns T object from the top of the stack
     * @throws EmptyCollectionException: Throws exception if stack is empty
     */
    @Override
    public T pop() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Stack Empty");
        }
        T result = list.get(eleTracker - 1);
        list.remove(eleTracker - 1);
        eleTracker--;
        return result;
    }

    /**
     * Description: Returns the object that is on top of stack without removing
     * it
     *
     * @return Returns T Object from the top of the stack
     * @throws EmptyCollectionException: Throws exception if stack is empty
     */
    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Stack Empty");
        }
        return list.get(eleTracker - 1);
    }

    /**
     * Description: Checks if the stack is empty and returns result as true
     * false.
     *
     * @return Boolean type return for the status of the stack.
     */
    @Override
    public boolean isEmpty() {
        if (eleTracker == 0) {
            return true;
        }
        return false;
    }

    /**
     * Description: Method that returns how many elements are in the stack
     *
     * @return Integer of the size of the stack.
     */
    @Override
    public int size() {
        return eleTracker;
    }

    /**
     * Description: Method to print out the contents of the stack.
     *
     * @return A String with all the contents of the stack.
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < eleTracker; i++) {
            if (list.get(i) != null) {
                sb.append(list.get(i).toString());
                sb.append(", ");
            }
        }
        return "ArrayStack{" + sb + '}';
    }

}
