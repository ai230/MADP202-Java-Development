package sortdoubles;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yamamotoai
 */
public class NewCSortDoublesWithOption {
    /*
A. Write an application containing an array of 15 double values.
    Include a method to sort and display the values in ascending order. 
    Compile, run, and check the results. Save the file as SortDoubles.java.
b. Modify the SortDoubles application to prompt the user whether 
    to view the list in ascending or descending order. 
    Save the file as SortDoublesWithOption.java.    
*/
    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("1)ascending 2)descending");
        System.out.print("Input number : ");
        int num = reader.nextInt();
        
        Double[] arr = { 3.4, 2.3, 5.7, 6.7, 9.0, 2.2, 2.1, 5.0, 6.5, 3.7, 4.6, 6.0, 7.0, 7.1, 0.3 };
        System.out.println(Arrays.toString(arr));
        
        if(num == 1){
            Arrays.sort(arr);
            System.out.println("1)ascending order");
        }else if(num == 2){
            Arrays.sort(arr, Collections.reverseOrder());
            System.out.println("2)descending order");
        }
        System.out.println(Arrays.toString(arr));
    }
}
