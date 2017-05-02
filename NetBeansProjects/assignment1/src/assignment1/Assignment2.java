/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/**
 *
 * @author CICCC-CIRAC
 */
public class Assignment2 {
    private static Object cal;
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
    /* Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
    Test Data
    Input an integer between 0 and 1000: 565
    Expected Output :
    The sum of all digits in 565 is 16*/
        int integer = 565;
        int digit = 0;
        int totalDigit = 0;
        int num = integer;
            while (num > 0) {
                digit = digit + num % 10;
                num = num / 10;
            }             
        System.out.println("The sum of all digits in " + integer + " is " + digit);     
        System.out.println("");
        
    //3)
    /*•	Write a Java program that prints the current time in GMT. 
        Test Data
        Input the time zone offset to GMT: 2:56pm
        Expected Output :
        Current time is 23:40:24*/
        
        Date now = new Date();
        System.out.println("Date() = " + now);
        System.out.println("Locale Code = " + Locale.getDefault());
        System.out.println("");
        TimeZone tz = TimeZone.getDefault();
        System.out.println("TimeZome ID = " + tz.getID());
        System.out.println("TimeZome名称 = " + tz.getDisplayName());
        System.out.println("TimeZome Offset  = " + tz.getRawOffset());
        
        System.out.println("");
        
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
    
    double distance = 2500;
    double hour = 5;
    double mins = 56;
    double sec = 23;
    double speed = 0;
    double totalSec = (hour * 60 * 60) + (mins * 60) + sec;
    System.out.println("Your speed in meters/second is " + (double)distance/totalSec);
    System.out.println("Your speed in meters/second is " + (double)(distance/1000)/(totalSec / 60 / 60));
    System.out.println("Your speed in meters/second is " + (double)(distance* 0.000621371)/totalSec * 60 * 60);
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
