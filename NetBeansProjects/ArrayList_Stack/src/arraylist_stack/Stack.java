/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist_stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 *
 * @author yamamotoai
 */
public class Stack {
    private ArrayList<Integer> arr;
    int size;
    
//    ArrayList<Integer> list1 = new ArrayList<Integer>(50);
    public Stack(int size) {
        this.size = size;
        arr = new ArrayList<Integer>(size);
        System.out.println("Size: " + size);
    }
    
    public void push(int element) {

        if (arr.size() > this.size) {
            System.out.println("FULL!!!!");
            throw new StackOverflowError("Stack is full");
        }
        arr.add(element);
        System.out.println(element + "is added " + " Size is " + arr.size());
    }

    public void pop() {
        if (arr.isEmpty()) {
            System.out.println("Empty");
            throw new EmptyStackException();
        }
        arr.remove(arr.size()-1);
        
    }

    public boolean isEmpty() {
        if (arr.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (arr.size()-1 == size) {
            return true;
        }
        return false;
    }

    public int size() {
        return arr.size();
    }
    
    public void print() {
        System.out.println(arr);
    }
}
