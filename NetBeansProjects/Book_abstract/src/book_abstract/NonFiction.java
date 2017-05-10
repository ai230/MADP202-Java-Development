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
public class NonFiction extends Book_abstract {
    
        public NonFiction(String title) {
        super(title);
    }
    
    void setPrice(){
       price = 37.99;
    }
}
