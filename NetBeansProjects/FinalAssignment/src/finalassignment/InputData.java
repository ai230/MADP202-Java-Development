/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalassignment;


/**
 *
 * @author yamamotoai
 */
public class InputData {
    
    private int ID;
    private String date;
    private double amount;
    private String category;
    private String property;
    
    double totalAmount = 0.0;


    public InputData(int ID, String category, String property, double amount, String date) {
        this.ID = ID;
        this.date = date;
        this.amount = amount;
        this.category = category;
        this.property = property;
    }
    
    //setter
    public void setDate(String date) {
        this.date = date;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
 
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    //getter
    public int getID() {
        return ID;
    }

    public String getDate() {
        return date;
    }
    
    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getProperty() {
        return property;
    }

    
    @Override
    public String toString(){
        
        String s;        
        s = "[" + ID + "] " + date + " <Property> " + property + " <Category> " + category + " <Amount> $" + amount + "\n";
        
        return s;   
    }
}
