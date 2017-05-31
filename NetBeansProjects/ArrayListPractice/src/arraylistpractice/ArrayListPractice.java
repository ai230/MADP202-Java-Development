/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author yamamotoai
 */
public class ArrayListPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list);

        while (list.size() >= 3) {
            list.remove(2);
            System.out.println(list);
        }
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
            System.out.println(list);
        }
        if (list.size() == 1) {
            list.remove(0);
        }
        if (list.isEmpty()) {
            System.out.println("Size is empty!!");
        }
    }

}
