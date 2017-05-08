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
public class Coffee extends Drink {
    protected int numberOfSuger;
    protected int numberOfMilk;
    
    public Coffee(double price, int amount) {
        super(price, amount);
    }
    
    public void setNumberOfSuger(int numberOfSuger) {
        this.numberOfSuger = numberOfSuger;
    }
    
    public void setNumberOfMilk(int numberOfMilk) {
        this.numberOfMilk = numberOfMilk;
    }
    
    public int getNumberOfSuger() {
        return numberOfSuger;
    }
    
    public int getNumberOfMilk() {
        return numberOfSuger;
    }
}
