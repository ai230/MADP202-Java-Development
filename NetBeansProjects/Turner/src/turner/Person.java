/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turner;

/**
 *
 * @author yamamotoai
 */
public class Person implements Turner{

    @Override
    public void turn() {
        System.out.println("Right Left");
    }
    
}
