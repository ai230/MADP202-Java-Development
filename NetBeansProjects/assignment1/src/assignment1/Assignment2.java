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
public class Assignment2 {
    public static void main(String[] args) {
    //PART 2
    //1)
    /*•	Write a Java program to convert temperature from Fahrenheit to Celsius degree 
    Test Data
    Input a degree in Fahrenheit: 212
    Expected Output :
    212.0 degree Fahrenheit is equal to 100.0 in Celsius
    T(°C) = (T(°F) - 32) × 5/9 */
        double Fahrenheit = 212.0;
        double Celsius = (Fahrenheit - 32) * 5/9;
        System.out.println(Fahrenheit + " degree Fahrenheit is equal to " + Celsius + " in Celsius");
        System.out.println("");
        
    //2)
    //        •	Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
    //Test Data
    //Input an integer between 0 and 1000: 565
    //Expected Output :
    //The sum of all digits in 565 is 16
    //        int num = 0;
    //        int digit = 0;
    //        int totalDigit = 0;
    //        for(int i = 0; i < 100; i++){
    //            while (num <= i) {
    //                digit = digit + num % 10;
    //                num = num / 10;
    //                totalDigit = totalDigit + digit;
    //                num++;
    //                System.out.println(totalDigit);
    //            }
    //            
    //            
    //        }
            //System.out.println(totalDigit);
            
    //3)
    /*•	Write a Java program that prints the current time in GMT. 
        Test Data
        Input the time zone offset to GMT: 256
        Expected Output :
        Current time is 23:40:24*/

    //4)
    /*•	Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters). 
    Test Data
    Input distance in meters: 2500 
    Input hour: 5 
    Input minutes: 56
    Input seconds: 23
    Expected Output :
    Your speed in meters/second is 0.11691531 
    Your speed in km/h is 0.42089513 
    Your speed in miles/h is 0.26158804*/
    
    int distance = 2500;
    int hour = 5;
    int mins = 56;
    int sec = 23;
    double speed = 0;
    System.out.println("Your speed in meters/second is " + (double)sec/distance);
    System.out.println("Your speed in meters/second is " + (double)hour/distance*100);
    System.out.println("Your speed in meters/second is " + (double)sec/distance);
    System.out.println("");
    
    //5)
    /*•	What is the numeric value of each of the following expressions as evaluated by Java?
    a. 4 + 6 * 3
    b. 6 / 3 * 7
    c. 18 / 2 + 14 / 2
    d. 16 / 2
    e. 17 / 2
    f. 28 / 5
    g. 16 % 2
    h. 17 % 2
    i. 28 % 5
    j. 28 % 5 * 3 + 1
    k. (2 + 3) * 4
    l. 20 / (4 + 1)*/
    System.out.println(4 + 6 * 3);
    System.out.println(6 / 3 * 7);
    System.out.println(18 / 2 + 14 / 2);
    System.out.println(16 / 2);
    System.out.println(17 / 2);
    System.out.println(28 / 5);
    System.out.println(16 % 2);
    System.out.println(17 % 2);
    System.out.println(28 % 5);
    System.out.println(28 % 5 * 3 + 1);
    System.out.println((2 + 3) * 4);
    System.out.println(20 / (4 +1));
    System.out.println("");
    }
    
    //6)
    /*•	What is the value of each of the following Boolean expressions?
    a. 4 > 1 -->false
    b. 5 <= 18 --->true
    c. 43 >= 43 --->true
    d. 2 == 3 -->false
    e. 2 + 5 == 7 --->true
    f. 3 + 8 <= 10 -->false
    g. 3 != 9 --->true
    h. 13 != 13 -->false
    i. –4 != 4 --->true
    j. 2 + 5 * 3 == 21 -->false*/
    
    

}
