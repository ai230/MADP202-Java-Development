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

        StringBuffer str = new StringBuffer("hello");
        StringBuilder str1 = new StringBuilder("h");
        System.out.println(str);
        char c = 0;
        char comChar = 0;
        for(int i = 0; i < 5; i++){
            comChar = str.charAt(i);
            for(int j = 0; j < 4; j++){
            c = str.charAt(i+j+1);
            System.out.println("i=" + i + " " + "j=" + j + " " + comChar + ":" + c);
                if(c == comChar){
                    System.out.println(c + ":" + comChar);
                    str = str.delete(j,j+1);
                    System.out.println("str=" + str);
                }
            }
            str1.append(c);
            comChar = str.charAt(i+1);
        }
        System.out.println("Ans str=" + str);
        System.out.println("Ans str1=" + str1);
    }
}
