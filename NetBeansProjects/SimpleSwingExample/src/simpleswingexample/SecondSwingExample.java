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
public class SecondSwingExample { 
    JFrame f;  
    void Simple(){
        f=new JFrame();//creating instance of JFrame  

        JButton b=new JButton("click2");//creating instance of JButton  
        b.setBounds(130,100,100, 40);  

        f.add(b);//adding button in JFrame  

        f.setSize(400,500);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  
    }  
  
    public static void main(String[] args) {  
        SecondSwingExample eg2 = new SecondSwingExample();
        eg2.Simple();  
    }  

}
