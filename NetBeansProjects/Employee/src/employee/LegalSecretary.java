/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author yamamotoai
 */
public class LegalSecretary extends Secretary {
    public double getSalary() {
        return super.getSalary() + 5000.0;      // $45,000.00 / year
    }
    
    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }
}
