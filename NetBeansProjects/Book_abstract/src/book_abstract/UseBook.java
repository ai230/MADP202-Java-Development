package book_abstract;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yamamotoai
 */
public class UseBook {
    public static void main(String[] args) {
        
        Fiction f1 = new Fiction("Fiction Book");
        NonFiction n1 = new NonFiction("Nonfic Book");
        f1.setPrice();
        n1.setPrice();
        System.out.println(f1.getTitle() + " $" + f1.getPrice());
        System.out.println(n1.getTitle() + " $" + n1.getPrice());
        
    }
}
