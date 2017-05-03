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
        
        //4)
        String str4 = new String ("It is better to deserve honours and not have them than to have them and not deserve them.");
        System.out.println(str4.indexOf('h'));
        System.out.println(str4.charAt(14));
        System.out.println(str4.endsWith("Twain"));
        System.out.println(str4.replace('a','A'));
        System.out.println("");
        
        
        
        //5)
      
    }
}