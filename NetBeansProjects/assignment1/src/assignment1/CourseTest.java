/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.*;
/**
 *
 * @author yamamotoai
 */
public class CourseTest {
    public static void main (String[] args) {
         ArrayList<String> studens = new ArrayList<String>();
         studens.add("Amy");
         studens.add("Bob");
         studens.add("Cindy");
         studens.add("David");
         
         CourseTest.printOutArrayList(studens);
    }
    public static void printOutArrayList(ArrayList<String> studens) {
        for(int i = 0; i < studens.size(); i++){
            System.out.println(studens.get(i));
        }
        System.out.println("Size: " + studens.size());
    }
}
