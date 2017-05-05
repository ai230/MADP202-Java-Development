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
public class Pizza {
    
    private String toppings;
    private int diameter; //inches
    private double price;
    
    public Pizza(String toppings, int diameter, double price) {
        this.toppings = toppings;
        this.diameter = diameter;
        this.price = price;
    }
    
    public Pizza() {
        this.toppings = toppings;
        this.diameter = diameter;
        this.price = price;
    }
    
    public void setTopping(String toppings) {
        this.toppings = toppings;
    }
    
    public void setdiameter(int diameter) {
        this.diameter = diameter;
    }
    
    public void setToppingprice(double price) {
        this.price = price;
    }
    
    public String getTopping() {
        return toppings;
    }
    
    public int getdiameter() {
        return diameter;
    }
    
    public double price() {
        return price;
    }
    
    @Override
    public String toString() {
        String description = "";
        description += "Topping: \t" + toppings + "\n";
        description += "Inches: \t" + diameter + "\n";
        description += "Price: \t" + price + "\n";
        return description;
    }
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
}
