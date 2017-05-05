/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gettersettermethodpizza;

/**
 *
 * @author yamamotoai
 */
public class asTestPizza {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Pepperoni", 12, 13.99);
        String str = p1.toString();
        System.out.println(str);
        
        Pizza p2 = new Pizza();
        p2.setTopping("Pepperoni");
        p2.setdiameter(10);
        p2.setToppingprice(15.99);
        String t = p2.getTopping();
        System.out.println(t);
        int d = p2.getdiameter();
        System.out.println(d);
        str = p2.toString();
        System.out.println(str);
        
    }
}
