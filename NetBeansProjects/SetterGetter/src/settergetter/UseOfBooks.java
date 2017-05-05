/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settergetter;

/**
 *
 * @author yamamotoai
 */
public class UseOfBooks {

    public static void main(String[] args) {
        Book b1 = new Book("JAVA", "JOHN LEWIS", "PEARSONS", 17032017);
        String str = b1.toString();
        System.out.println(str);

        Book b2 = new Book("COMPLETE REFERENCE ON JAVA", "HERBET SHIELD", "PEARSONS", 17032017);
        String str1 = b2.toString();
        System.out.println(str1);
    }
}