/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gotoofar;
import java.util.Scanner;
/**
 *
 * @author yamamotoai
 */
public class NegativeArray {
    public static void main(String[] args) {
        boolean success;
        System.out.print("Input a size of array: ");
        try{   
            Scanner s = new Scanner(System.in);  
            String arrSize = s.nextLine();
            int n = Integer.parseInt(arrSize);
            Integer[] arr = new Integer[n];    
            success = true;
        }catch(NegativeArraySizeException nase){
            success = false;
            System.out.print(nase);
            System.out.println(" : the array was not created.");
        }catch(NumberFormatException nfe){
            success = false;
            System.out.print(nfe);
            System.out.println(" : the array was not created.");
        }
        
        if(success){
            System.out.println("the array was created successfully.");
        }
        
    }
}
