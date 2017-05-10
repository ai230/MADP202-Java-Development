/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_abstract;

/**
 *
 * @author yamamotoai
 */
public abstract class Book_abstract {
    private String title;
    protected double price;

    public Book_abstract(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public double getPrice() {
        return price;
    }
    
    abstract void setPrice();

}
