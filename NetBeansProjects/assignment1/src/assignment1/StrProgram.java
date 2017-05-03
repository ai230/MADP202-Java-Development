/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author CICCC-CIRAC
 */
public class StrProgram {
    public static void main(String[] args) {
        //1)
        //Write program to accept a line and check how many consonants and vowels are there in line.
        String str1 = new String("Hello world");
        System.out.println(str1);
        
        int vowels = 0;
        int consonants = 0;
        char j = 0;
        for (int i = 0; i < str1.length(); i++){
            j = str1.charAt(i);
            //System.out.println(j);

            if (j == 'a'){
                vowels++;
            }
            else if (j == 'e'){
                 vowels++;
            }
            else if (j == 'u'){
                vowels++;
            }
            else if (j == 'i'){
                vowels++;
            }
            else if (j == '0'){
              vowels++;
            }
            else if (j == ' '){
            }
            else{
                consonants++;
            }
      }
        System.out.println("Number of vowels: " + vowels + "Number of consonant: " + consonants);
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
                for(int k = 0; k < rotateStr1.length(); k++){
                    if(rotateStr2.length() > 0){
                        if(rotateStr1.charAt(i) == rotateStr2.charAt(k)){
                            rotateStr3.append(rotateStr2.charAt(k));
                            rotateStr2.delete(k,k);
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
        
        //4)
        String str4 = new String ("It is better to deserve honours and not have them than to have them and not deserve them.");
        System.out.println(str4.indexOf('h'));
        System.out.println(str4.charAt(14));
        System.out.println(str4.endsWith("Twain"));
        System.out.println(str4.replace('a','A'));
        System.out.println("");
          
        //5)
        StringBuffer str = new StringBuffer("helloo");
        System.out.println(str);
        char c = 0;
        char comChar = 0;
        int length = str.length()-1;
        
        for(int i = 0; i < length; i++){
            comChar = str.charAt(i);
            System.out.println("i len=" + length);
            
            for(int m = 0; m < length-i; m++){
            c = str.charAt(i+m+1);
            System.out.println("i=" + i + " " + "m=" + m + " " + comChar + ":" + c);
                if(c == comChar){
                    System.out.println(c + ":" + comChar);
                    str = str.delete(i+m+1,i+m+2);
                    System.out.println("------------------str=" + str);
                    length--;
                }
            }
        }
        System.out.println("Ans str=" + str);
    }
}