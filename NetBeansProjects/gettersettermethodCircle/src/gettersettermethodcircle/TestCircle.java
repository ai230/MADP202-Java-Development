/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gettersettermethodcircle;

/**
 *
 * @author yamamotoai
 */
public class TestCircle {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circle c1 = new Circle();
        c1.setRadius(5);

        Circle c2 = new Circle();
        c2.setRadius(10);
        
        Circle c3 = new Circle();
        
        System.out.println("c1: " + c1.getRadius());
        System.out.println("c1: " + c1.getArea());
        System.out.println("c1: " + c1.getDiameter());
        System.out.println("");
        
        System.out.println("c2: " + c2.getRadius());
        System.out.println("c2: " + c2.getArea());
        System.out.println("c2: " + c2.getDiameter());
        System.out.println("");
        
        System.out.println("c3: " + c3.getRadius());
        System.out.println("c3: " + c3.getArea());
        System.out.println("c3: " + c3.getDiameter());
        System.out.println("");
    }
}
