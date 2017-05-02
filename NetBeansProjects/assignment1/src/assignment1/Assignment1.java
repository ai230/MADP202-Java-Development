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
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PART 1 BASICS OF JAVA 
        //1)
        System.out.println("Hello"); 
        System.out.println("Ai");
        System.out.println("");
        //2)
        byte a = 10;
        byte b = 3;
        int sum = a + b;
        int subtraction = a - b;
        int multiplication  = a * b;
        int division = a / b;

        System.out.println("sum = " + sum);
        System.out.println("subtraction = " + subtraction);
        System.out.println("multiplication = " + multiplication );
        System.out.println("division = " + division);
        System.out.println("");
        //3)
        /*a. -5 + 8 * 6
        b. (55+9) % 9 
        c. 20 + -3*5 / 8 
        d. 5 + 15 / 3 * 2 - 8 % 3 */
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8%3);
        System.out.println("");
        
        //4)
        byte c = 125;
        byte d = 24;
        System.out.println(c + " + " + d + " = " + (c+d));
        System.out.println(c + " - " + d + " = " + (c-d));
        System.out.println(c + " x " + d + " = " + (c*d));
        System.out.println(c + " / " + d + " = " + (c/d));
        System.out.println(c + " mod " + d + " = " + (c%d));
        System.out.println("");
        /*125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5*/
        
        //5)
        /*Radius = 7.5 
        Expected Output
        Perimeter is = 47.12388980384689 
        Area is = 176.71458676442586*/
        double radius = 7.5;
        double perimeter = radius * Math.PI * 2;
        double area = radius * radius * Math.PI;
        System.out.println("perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
        System.out.println("");
        
        //6)
        //The sum of the digits is 7
        int num = 25;
        int digit = 0;
        while (num > 0) {
            digit = digit + num % 10;
            num = num / 10;
        }
        System.out.println("The sum of the digits is " + digit);
    }
    
}
