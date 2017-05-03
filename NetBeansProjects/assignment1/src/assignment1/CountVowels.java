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
public class CountVowels {
    public static void main(String[] args) {
        String str = new String("Home is the place, when you have to go there, they have to take you in. Robot Frost");
        System.out.println(str);
        
        int vowels = 0;
        char j = 0;
        for (int i = 0; i < str.length(); i++){
            j = str.charAt(i);

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
      }
        System.out.println("Number of vowels: " + vowels);
    }
}
