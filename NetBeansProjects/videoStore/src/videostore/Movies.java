/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videostore;

/**
 *
 * @author yamamotoai
 */
public class Movies {
    private String name;
    private Double price;

    public Movies(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
 
    public double getTotalPrice() {
        double totalPrice = 0.00;
        totalPrice += totalPrice + this.price;
        return totalPrice;
    }
}
