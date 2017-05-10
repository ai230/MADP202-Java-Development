/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

/**
 *
 * @author yamamotoai
 */
public class DemoSquare {

    public static void main (String[] args) {
        // TODO code application logic here
        
        Cube c1 = new Cube();
        System.out.println(c1.computeSurfaceArea(10, 10, 10));
        System.out.println(c1.computeSurfaceArea(10, 10));
        Square s1 = new Square();
        System.out.println(s1.computeSurfaceArea(10, 10));
        
    }
}
