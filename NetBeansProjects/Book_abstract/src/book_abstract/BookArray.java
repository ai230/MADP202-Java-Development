/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_abstract;
import java.util.ArrayList;
/**
 *
 * @author yamamotoai
 */
public class BookArray {
    public static void main(String[] args) {
        ArrayList<Book_abstract> bookArray = new ArrayList<Book_abstract>();
        
        Fiction f1 = new Fiction("Fiction Book1");
        Fiction f2 = new Fiction("Fiction Book2");
        Fiction f3 = new Fiction("Fiction Book3");
        Fiction f4 = new Fiction("Fiction Book4");
        Fiction f5 = new Fiction("Fiction Book5");
        NonFiction n1 = new NonFiction("Nonfic Book1");
        NonFiction n2 = new NonFiction("Nonfic Book2");
        NonFiction n3 = new NonFiction("Nonfic Book3");
        NonFiction n4 = new NonFiction("Nonfic Book4");
        NonFiction n5 = new NonFiction("Nonfic Book5");
        
        bookArray.add(f1);
        bookArray.add(f2);
        bookArray.add(f3);
        bookArray.add(f4);
        bookArray.add(f5);
        bookArray.add(n1);
        bookArray.add(n2);
        bookArray.add(n3);
        bookArray.add(n4);
        bookArray.add(n5);
        
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < bookArray.size(); i++){
            bookArray.get(i).setPrice();
            str.append(bookArray.get(i).getTitle());
            str.append(" " + bookArray.get(i).getPrice());
            str.append("\n");
        }
        System.out.println(str.toString());
    }
}
