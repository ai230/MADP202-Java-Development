package student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yamamotoai
 */
public class ShowStudent {
    public static void main(String[] args) {
        
        Student student = new Student(1234, 3, 80);
        
        Student student2 = new Student();
        
        System.out.println(student.toString());
        System.out.println(student2.toString());
    }
}
