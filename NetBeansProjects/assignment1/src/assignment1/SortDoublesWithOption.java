package assignment1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yamamotoai
 */
public class SortDoublesWithOption {
    public static void main (String[] args) {
        /*
        b. Modify the SortDoubles application to prompt the user whether to view 
        the list in ascending or descending order. Save the file as SortDoublesWithOption.java.
        */
        
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
