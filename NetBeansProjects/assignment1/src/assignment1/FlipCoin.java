/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author yamamotoai
 */
public class FlipCoin {
    public static void main(String[] args) {
        /*
        Write an application that displays the results of a series of 10 coin tosses. 
        Use the Math.random() function explained in Appendix D to generate a number 
        between 0 and 1; you will use a statement similar to: After each coin toss, 
        display whether the toss represents “heads” or “tails.”
        If the result is 0.5 or less, the result represents heads; 
        otherwise, it represents tails. After the 10 tosses are complete, 
        display the percentages of heads and tails. 
        Run the application several times until you are confident that the coin tosses occur randomly.
        Save the file as FlipCoin.java.
        */
        
        Random rand = new Random();
        
        int tosses = 10;
        int headsCount = 0;
        int tailsCount = 0;
        
        for(int i = 0; i < tosses; i++){
            float random = rand.nextFloat();
            System.out.println(random);
        
            if(0 < random && random <= 0.5){
                headsCount++;
                System.out.println("heads");
            }else if(0.5 < random && random <= 1){
                tailsCount++;
                System.out.println("tails");
            }
        }
        System.out.println(headsCount + " " + tailsCount + " " + tosses);

        int headsPer = headsCount * 10;
        int tailsPer = tailsCount * 10;
        System.out.println("Head is " + headsPer + "%");
        System.out.println("Tail is " + tailsPer + "%");
    }
}
