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
public class Main {
    public static void main(String[] args) {
        Janitor j = new Janitor();
        j.getHours();
        j.getSalary();
        j.getVacationDays();
        j.clean();
    }
}