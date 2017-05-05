/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.Scanner; 
//import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
/**
 *
 * @author yamamotoai
 */
public class Assignment3 {
    public static void main(String[] args) {
    
        /*1)
        Write a Java program to get a number from the user and print whether it is positive or negative. 
        Test Data Input number: 35 Expected Output : Number is positive*/
        
        /*Scanner reader1 = new Scanner(System.in);  // Reading from System.in
        System.out.println("Input number: ");
        int num = reader1.nextInt(); // Scans the next token of the input as an int.
        
        
        if(num >= 0){
            System.out.println("Your number is positive");
        }
        else{
            System.out.println("Your number is negative");
        }
        */
        
        //2)
        /*Write a Java program that takes the user to provide a single character 
        from the alphabet. Print Vowel or Consonant, depending on the user input. 
        If the user input is not a letter (between a and z or A and Z), 
        or is a string of length > 1, print an error message. 
        Test Data Input an alphabet: p  
        Expected Output : Input letter is Consonant*/
        
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String str2 = reader2.nextLine();
        boolean isNumber;
        boolean isVowel = true;
        
        if(str2.length() > 1){
            System.out.println("Error : Input number is not an alphabet");
        }else{
            //check if str2 is an integer 
            try{
                int num2 = Integer.parseInt(str2);
                
                isNumber = true;
                System.out.println("Error : Input number is an number");
               
            } catch (NumberFormatException e) {

                isNumber = false;
            }
            if(isNumber == false){
                
                switch(str2){
                    case "a":
                        break;
                    case "e":
                        break;
                    case "i":
                        break;
                    case "u":
                        break;
                    case "o":
                        break;
                    default:
                        isVowel = false;
                        break;     
                }
                
                if(isVowel){
                    System.out.println("Input letter is vowel");
                }else{
                    System.out.println("Input letter is Consonant");
                }
            }
        }
    }//end main
}
