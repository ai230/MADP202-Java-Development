/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author yamamotoai
 */
public class Median {
    public static void main(String[] args) {
        /*
        1 .  The median of a list is its middle value when the values are placed in order.
        For example, if a list contains 1, 4, 7, 8, and 9, then the median is 7.
        Write an application that allows you to enter nine double values and display them 
        and their median. Save the file as Median.java. 
        b. Revise the Median class so that the user can enter any number of values up to nine. 
        If the list has an even number of values, the median is the numeric average of the values
        in the two middle positions. Save the file as Median2.java
        */
        
        ArrayList<Double> list = new ArrayList<Double>();
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        double median = 0;
        for(int i = 0; i < 9; i++){
            System.out.print(i+1 + ") " + "Input number : ");
            double num = reader.nextDouble();
            list.add(num);
        }
         
        System.out.println(list); // prints "[1, 2, 3]"
        
        for(int i = 1; i < list.size(); i++)
         sum += list.get(i);
        
        median = sum / list.size();
        System.out.println("The median is " + median);
        
        
    }
}
