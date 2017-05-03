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
public class strAssignment {
    public static void main(String[] args) {
        //1)
        //Write program to accept a line and check how many consonants and vowels are there in line.
        System.out.println("");
        
        //2)
        //Write a program to find that given number or string is palindrome or not.
        StringBuffer palStr = new StringBuffer("madam");
        char c1 = 0;
        char c2 = 0;
        boolean palindrome = true;
        String reverseStr = new StringBuffer(palStr).reverse().toString();
        System.out.println("String: " + palStr);
        for(int i = 0; i < palStr.length(); i++){
            c1 = palStr.charAt(i);
            c2 = reverseStr.charAt(i);
            if(c1 != c2)
            {
                palindrome = false;
            }
        }
        String s = palindrome?" is ":" is not ";
        System.out.println(palStr + s + "palindrome.");
        System.out.println("");
        
        StringBuffer rotateStr1 = new StringBuffer("tip");
        StringBuffer rotateStr2 = new StringBuffer("pti");
        StringBuffer rotateStr3 = new StringBuffer("");
        System.out.print(rotateStr1 + " and " + rotateStr2);

        if(rotateStr1.length() == rotateStr2.length()){
            for(int i = 0; i < rotateStr1.length(); i++){
                for(int j = 0; j < rotateStr1.length(); j++){
                    if(rotateStr2.length() > 0){
                        if(rotateStr1.charAt(i) == rotateStr2.charAt(j)){
                            rotateStr3.append(rotateStr2.charAt(j));
                            rotateStr2.delete(j,j);
                            break;
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("False");
        }
        System.out.println(" -----------> " + rotateStr3);
    }
}
