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
public class Checking extends Account{
    private String str = "Checking Account Information";
    
    public Checking(int accountNum) {
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
    
}
