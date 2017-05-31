/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_queue;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author yamamotoai
 */
public class Queue {

    private static final int capacity = 3;
    private LinkedList<Integer> list;
//    int arr[] = new int[capacity];
    int size = 0;
    int front  = -1;   //index if stack
    int rear = 0;

    public Queue(){
        this.size = size;
        list = new LinkedList<Integer>();
    } 
    
    public void enQueue(int element) {//add
        
        list.addLast(element);
        System.out.println("Element " + element
                    + " is pushed to Queue !");
    }

    public void deQueue() {//remove
        list.remove();
        System.out.println("Pop operation done !");
    }

    public void display() {
//        if (front >= rear) {
//            System.out.println("Elements in Queue : ");
//            for (int i = rear; i <= front ; i++) {
//                System.out.println(arr[i]);
//            }
//        }
    }
    
    public void print(){
        System.out.println(list);
    }
    
}
