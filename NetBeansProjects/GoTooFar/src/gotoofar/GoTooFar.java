/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gotoofar;

import java.util.ArrayList;

/**
 *
 * @author yamamotoai
 */
public class GoTooFar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);
        arr.add(e);
        
            try{
                for(int i = 0; i <= 6; i++){
                    System.out.println(i+1 + ") " + arr.get(i));
                }
            }catch(IndexOutOfBoundsException ex){
                System.out.print(ex);
                System.out.println(" : Now you’ve gone too far.");
            }
         
    }
    
}
