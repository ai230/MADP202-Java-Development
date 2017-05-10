/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author yamamotoai
 */
public class DemoAccount {
    public static void main(String[] args) {
        Checking c = new Checking(123456);
        c.getAccountBalance();
        c.getAccountNumber();
        System.err.println("Checking balance: " + c.accountBalance);
        System.err.println("Checking account number: " + c.getAccountNumber());
        
        Saving s = new Saving(1234567, 2.0);
        s.getAccountNumber();
        s.getAccountBalance();
        s.getInterestRate();
        System.err.println("Saving balance: " + s.accountBalance);
    }
}
