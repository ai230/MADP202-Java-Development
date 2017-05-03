/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.Scanner; 
/**
 *
 * @author yamamotoai
 */
public class Balance {
    public static void main(String[] args) {
        //3)
        /*A.Write an application that prompts the user for a checking account balance 
        and a savings account balance. Display the message 
        “Checking account balance is low” if the checking account balance is less than $10. 
        Display the message “Savings account balance is low” if the savings account balance is less than $100.
        Save the file as Balance.java.
        
        b. Modify the application in Exercise a to display an additional message, “Both accounts are dangerously low”, 
        if both fall below the specified limits. Save the file as Balance2.java.*/
        
        Scanner promptChecking = new Scanner(System.in);
        System.out.println("Input Checking account balance : ");
        int CheckingAccountBalance = promptChecking.nextInt();
        
        Scanner promptSaving = new Scanner(System.in);
        System.out.println("Input Saving account balance : ");
        int SavingAccountBalance = promptSaving.nextInt();
     
        if(CheckingAccountBalance < 10){

            System.out.println("Checking account balance is low");

        }
        if(SavingAccountBalance < 100){

            System.out.println("Savings account balance is low");

        }
        
        
    }
}
