/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author yamamotoai
 */
public class EvenNums {
    public static void main(String[] args){
        /*Write an application that displays all even numbers from 2 to 100 inclusive, and that starts
        a new line after every multiple of 20 (20, 40, 60, and 80). Save the file as EvenNums.java.*/
        int evenNum = 0;
        
        for(int i = 2; i <= 100; i++){
            if(i % 2 == 0){
                if(i % 20 == 0){
                System.out.println("");
                }
                System.out.print(i + " ");
            }
            
        }
    }
}
