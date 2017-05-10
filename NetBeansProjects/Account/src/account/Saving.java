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
public class Saving extends Account{
    private double interestRate;
    private String str = "Saving Account Information";
    
    public Saving(int accountNum, double interestRate) {
        super(accountNum);
    }

    @Override
    int getAccountNumber() {
        System.out.println(str);
        return accountNum;
    }

    @Override
    double getAccountBalance() {
        return accountBalance;
    }

    double getInterestRate() {
        return interestRate;
    }
}
