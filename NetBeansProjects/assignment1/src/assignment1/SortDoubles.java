/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.Arrays;
/**
 *
 * @author yamamotoai
 */
public class SortDoubles {
    public static void main (String[] args) {
        /*
        2. a.Write an application containing an array of 15 double values. 
        Include a method to sort and display the values in ascending order.
        Compile, run, and check the results. Save the file as SortDoubles.java.
        */
        
        double[] arr = { 3.4, 2.3, 5.7, 6.7, 9.0, 2.2, 2.1, 5.0, 6.5, 3.7, 4.6, 6.0, 7.0, 7.1, 0.3 };
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
         
}
