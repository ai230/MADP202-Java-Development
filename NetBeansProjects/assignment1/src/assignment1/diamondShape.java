package assignment1;
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
public class diamondShape {
    public static void main(String[] args) {
       /*
        Write an interactive program to print a diamond shape. For example, 
        if user enters the number 3, the diamond will be as follows:
        *
        * *
        * * *
        * * * *
        
        */

        Scanner inputNum = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = inputNum.nextInt();
        
        for(int i = 0; i <= num; i++){
            for(int j = 0; j <= i;j++){
                System.out.print("*");
            }
            System.out.println(""); 
        }
        
        System.out.println(""); 
        
        /*
        Write a program in Java to make such a pattern like right angle triangle 
        with a number which will repeat a number in a row.The pattern is as follows : 
        */
        /*
        1
        22
        333
        4444
        */
        int num1 = 4;
        for(int i = 1; i <= num1; i++){
            for(int j = 1; j <= i;j++){
                System.out.print(i);
            }
            System.out.println(""); 
        }
        
        System.out.println(""); 
        
        /*
        1
        23
        456
        78910
        */
        
        int num2 = 4;
        int count = 1;
        for(int i = 1; i <= num2; i++){
            for(int j = 1; j <= i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println(""); 
        }
        
        System.out.println(""); 
        
        /*
        1                                                                                
        01                                                                               
        101                                                                              
        0101                                                                             
        10101
        */
        
        int num3 = 5;
        int n = 1;
        for(int i = 1; i <= num3; i++){
            for(int j = 1; j <= i;j++){
                System.out.print(n);
                n = (n==1)?0:1;
            }
            System.out.println(""); 
        }
        
        System.out.println(""); 
    }
}
