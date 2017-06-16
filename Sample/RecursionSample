/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CICCC-CIRAC
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            // TODO code application logic here
            int resultMystery = mystery(648);
            System.out.println("result=" + resultMystery);
            System.out.println("------------");
            
            String resultReverse = reverse("abcd");
            System.out.println("result=" + resultReverse);
            System.out.println("------------");
            
            File f = new File("text1.txt");
            Scanner file = new Scanner(f);
            reverseLines(file);
            file.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Recursion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }
        
        
    }

    public static int mystery(int n) {
        if (n < 10) {
            System.out.println("Now n<10 n=" + n);
            return n;
        } else {
            int a = n / 10;
            int b = n % 10;
            System.out.println("a=" + a + " b=" + b + " n=" + n);
            return b + mystery(a);
        }
    }
    
    public static String reverse(String s){
        if (s.length() == 0) {
            System.out.println("Now s.length=" + s.length());
            return s;
        } else {
            String a = s.substring(s.length()-1);
            String b = s.substring(0,s.length()-1);    
            System.out.println("a=" + a + " b=" + b + " s=" + s);
            return a + reverse(b);
        }
    }
    
    public static void reverseLines(Scanner input){
        
        if(input.hasNextLine()){
            
            String line = input.nextLine();
            
            reverseLines(input);
            
            System.out.println(line);
        }
        
        
    }
    
    
    
}
