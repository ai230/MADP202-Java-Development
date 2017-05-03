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
public class Calculate {
    public static void main(String[] args) {
        
        /*Write an application that prompts the user for two integers 
        and then prompts the user to enter an option as follows:
        1 to add the two integers,
        2 to subtract the second integer from the first,
        3 to multiply the integers, 
        4 to divide the first integer by the second.
        Display an error message 
        if the user enters an option other than1 through 4 or if the user chooses the divide option 
        but enters 0 for the second integer. Otherwise, display the results of the arithmetic. 
        Save the file as Calculate.java.*/
        
        int result = 0;
        
        Scanner promptInteger1 = new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num1 = promptInteger1.nextInt();
        
        Scanner promptInteger2 = new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num2 = promptInteger2.nextInt();
        System.out.println("");
        
        System.out.println("1:Add the two integers\n" + "2:Subtract the second integer from the first integer\n" + "3:Multiply the integers\n" + "4:Divide the first integer by the second integer\n");
        
        Scanner promptOption = new Scanner(System.in);
        System.out.print("Input an number : ");
        byte optionNum = promptOption.nextByte();
        
        switch(optionNum){
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if(num2 == 0){
                    System.out.println("Error : Second integer is " + num2);
                }else{
                    result = num1 / num2;
                }
                break;    
            default:
                System.out.println("Error : Please input 1 to 4");
                break;
        }
        System.out.println("Result is " + result);
        

    }
}
