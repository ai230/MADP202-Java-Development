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
public abstract class Account {
    protected int accountNum;
    protected double accountBalance;
    
    public Account (int accountNum) {
        this.accountNum = accountNum;
        accountBalance = 0.0;
    }
    
    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }
    abstract int getAccountNumber();
    abstract double getAccountBalance();
    
}
