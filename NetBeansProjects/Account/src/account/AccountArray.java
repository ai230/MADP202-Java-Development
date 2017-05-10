/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author yamamotoai
 */
public class AccountArray {
    public static void main(String[] args) {
        ArrayList<Account> list = new ArrayList<>();
        
        Scanner scan1 = new Scanner(System.in);    
        Scanner scan2 = new Scanner(System.in);       
        Scanner scan3 = new Scanner(System.in);
        int aNum = 0;
        double interest = 0.0;
        for(int i = 0; i < 3; i++){
            System.err.print("1)Checking 2)Saving : ");
            int option = scan1.nextInt();

            if(option == 1){
                System.err.print("Input account number : ");
                aNum = scan2.nextInt();    
                Checking c = new Checking(aNum);
                list.add(c);
            }else if(option == 2){
                System.err.print("Input Account Number : ");
                aNum = scan2.nextInt(); 
                System.err.print("Input Interest Rate : ");
                interest = scan3.nextDouble();
                Saving s = new Saving(aNum, option);
                list.add(s);
            }
  
        }
        for(int i = 0; i < list.size(); i++){
                System.err.println(list.get(i).getAccountNumber());
                System.err.println(list.get(i).getAccountBalance());
        }
        
    }
}
