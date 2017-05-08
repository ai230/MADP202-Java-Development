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
public class Janitor extends Employee{
    public int getHours() {
        System.out.println(super.getHours()*2);
        return super.getHours()*2;           // works 80 hours / week
    }
    
    public double getSalary() {
        return super.getSalary() - 10000.0;      // $30,000.00 / year
    }
    
    public int getVacationDays() {
        return super.getVacationDays()/2;           // Harf as much vacation
    }
 
    public void clean() {
        System.out.println("Workin' for the man");
    }
    
}
