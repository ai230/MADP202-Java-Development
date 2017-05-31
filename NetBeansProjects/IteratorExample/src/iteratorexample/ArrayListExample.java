/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author yamamotoai
 */
public class ArrayListExample {

    public static void main(String args[]) {
        System.out.println("-------Iterator-------------");
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));

        Iterator it = list.iterator();
        System.out.println("it = " + it);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println("element = " + element);
            it.remove();
            System.out.println("list = " + list);
        }
        System.out.println("list = " + list);

        System.out.println("-------ListIterator-------------");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println("list1 = " + list1);

        ListIterator listIt = list1.listIterator();

        while (listIt.hasNext()) {
            Object element1 = listIt.next();
            System.out.println("element1 = " + element1);
            listIt.remove();
            System.out.println("list1 = " + list1);
        }
        System.out.println("list1 = " + list1);
    }
}
