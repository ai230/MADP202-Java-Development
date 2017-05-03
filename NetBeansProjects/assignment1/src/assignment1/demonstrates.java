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
public class demonstrates {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("helloo");
        System.out.println(str);
        char c = 0;
        char comChar = 0;
        int length = str.length()-1;
        
        for(int i = 0; i < length; i++){
            comChar = str.charAt(i);
            System.out.println("i len=" + length);
            
            for(int j = 0; j < length-i; j++){
            c = str.charAt(i+j+1);
            System.out.println("i=" + i + " " + "j=" + j + " " + comChar + ":" + c);
                if(c == comChar){
                    System.out.println(c + ":" + comChar);
                    str = str.delete(i+j+1,i+j+2);
                    System.out.println("------------------str=" + str);
                    length--;
                }
            }

        }
        
        System.out.println("Ans str=" + str);
    }
}
