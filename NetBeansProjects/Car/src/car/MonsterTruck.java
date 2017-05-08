/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author yamamotoai
 */
public class MonsterTruck extends Truck {
    
    public void m1() {
        System.out.println("monster1");
    }
    
    public void m2() {
        super.m1();
        super.m2();
    }
    
    public String toString() {
        System.out.print("monster ");
	return super.toString();
    }
}
