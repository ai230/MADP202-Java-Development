/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author yamamotoai
 */
public class DemoBook {
    public static void main(String[] args) {
        Textbook t = new Textbook();
        t.setTitle("Alice in Wonderland");
        t.setPages(100);
        t.setGradeLevel(12);
        
        System.out.println("Title: " + t.getTitle());
        System.out.println("Pages: " + t.getPages());
        System.out.println("Grade Level: " + t.getGradeLevel());
    }
}
