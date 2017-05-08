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
public class Employee {
    public int getHours() {
        return 40;           // works 40 hours / week
    }
    
    public double getSalary() {
        return 40000.0;      // $40,000.00 / year
    }
    
    public int getVacationDays() {
        return 10;           // 2 weeks' paid vacation
    }

    public String getVacationForm() {
        return "yellow";     // use the yellow form
    }
}
