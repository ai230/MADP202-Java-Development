/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorexample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author yamamotoai
 */
public class LinkedListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Linked List Declaration */
        System.out.println("-------Iterator-------------");
        LinkedList<String> linkedlist = new LinkedList<String>();

        /*add(String Element) is used for adding 
         * the elements to the linked list*/
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " + linkedlist);

        /*Iterator*/
        Iterator it = linkedlist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println("element = " + element);
            it.remove();
            System.out.println("linkedlist = " + linkedlist);
        }
        System.out.println("linkedlist = " + linkedlist);

        /* Linked List Declaration */
        LinkedList<String> linkedlist1 = new LinkedList<String>();

        System.out.println("-------ListIterator-------------");
        /*add(String Element) is used for adding 
         * the elements to the linked list*/
        linkedlist1.add("Item1");
        linkedlist1.add("Item5");
        linkedlist1.add("Item3");
        linkedlist1.add("Item6");
        linkedlist1.add("Item2");

        ListIterator listIt = linkedlist1.listIterator();

        while (listIt.hasNext()) {
            Object element1 = listIt.next();
            System.out.println("element1 = " + element1);
            listIt.remove();
            System.out.println("linkedlist1 = " + linkedlist1);
        }
        System.out.println("linkedlist1 = " + linkedlist1);

//         /*Add First and Last Element*/
//         linkedlist.addFirst("First Item");
//         linkedlist.addLast("Last Item");
//         System.out.println("LinkedList Content after addition: " +linkedlist);
//
//         /*This is how to get and set Values*/
//         Object firstvar = linkedlist.get(0);
//         System.out.println("First element: " +firstvar);
//         linkedlist.set(0, "Changed first item");
//         Object firstvar2 = linkedlist.get(0);
//         System.out.println("First element after update by set method: " +firstvar2);
//
//         /*Remove first and last element*/
//         linkedlist.removeFirst();
//         linkedlist.removeLast();
//         System.out.println("LinkedList after deletion of first and last element: " +linkedlist);
//
//         /* Add to a Position and remove from a position*/
//         linkedlist.add(0, "Newly added item");
//         linkedlist.remove(2);
//         System.out.println("Final Content: " +linkedlist);
    }

}
