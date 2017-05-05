/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Arrays;

/**
 *
 * @author yamamotoai
 */
public class TemperatureTest {
    public static void main (String[] args) {

        //String[][] dailyTemp = new String[2][2];
//        String[][] dailyTemp = {{"Mon","Tue","Wed"},{"70","61","64"}};
        double[] dailyTemp = {70,61,64,71,66,68,62};
        System.out.println(dailyTemp.length);
        
        for(int i = 0; i < dailyTemp.length; i++){
            System.out.print(dailyTemp[i] + ", ");
        }
        System.out.println("");
        
        TemperatureTest.average(dailyTemp);
          
        System.out.print("Average is " + TemperatureTest.average(dailyTemp));
    }

    public static double average(double[] aDouble){
        double total = 0;
        double ave;
        
        for(int i = 0; i < aDouble.length; i++){
            total += aDouble[i];
        }
        ave = total / aDouble.length;
        
        return ave;
    }
}
