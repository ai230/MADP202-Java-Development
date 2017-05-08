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
public class Drink extends Product {
    protected String size; //S T L

    public Drink(double price, int amount) {
        
        super(price, amount);
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public String getSize() {
        return size;
    }
}
