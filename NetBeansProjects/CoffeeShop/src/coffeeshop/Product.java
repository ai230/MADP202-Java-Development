/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeeshop;

/**
 *
 * @author yamamotoai
 */
public class Product {
    protected double price;
    protected int amount;
    
    public Product(double price, int amount) {
        System.out.println("price: $" + price + " amount: " + amount);
        this.price = price * amount;
    }
    
//    public void setPrice(double price) {
//        this.price = price;
//    }
    
    public double getPrice() {
         return price;
    }
}
