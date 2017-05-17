/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleswingexample;
import javax.swing.*;
/**
 *
 * @author yamamotoai
 */
public class ThirdSwingExample extends JFrame{//inheriting JFrame  {
      
//public class Simple2 extends JFrame{//inheriting JFrame  
    JFrame f;  
    void Simple2(){  
        JButton b=new JButton("click3");//create button  
        b.setBounds(130,100,100, 40);  

        add(b);//adding button on frame  
        setSize(400,500);  
        setLayout(null);  
        setVisible(true);  
    }
//}
    public static void main(String[] args) {  
        ThirdSwingExample eg3 = new ThirdSwingExample();
        eg3.Simple2();
    }
    
}
