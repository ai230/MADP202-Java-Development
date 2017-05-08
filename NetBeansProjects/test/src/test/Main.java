/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author yamamotoai
 */
public class Main {
    public static void main(String[] args) {
        Truck mycar = new Truck();
        System.out.println(mycar); // dont need to call toString?
        mycar.m1();                  
        mycar.m2();  
    }
}
