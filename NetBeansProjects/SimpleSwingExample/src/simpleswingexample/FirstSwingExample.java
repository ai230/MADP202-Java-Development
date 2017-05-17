/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Simple Java Swing Example
 */
package simpleswingexample;
import javax.swing.*;
/**
 *
 * @author yamamotoai
 */
public class FirstSwingExample {
    public static void main(String[] args) {  
        JFrame f=new JFrame();//creating instance of JFrame  
        
        
        JCheckBox checkBox1 = new JCheckBox("C++");  
        checkBox1.setBounds(100,100, 50,50);  
        JCheckBox checkBox2 = new JCheckBox("Java", true);  
        checkBox2.setBounds(100,150, 50,50); 
        
        
        JButton b=new JButton("click1");//creating instance of JButton  
        b.setBounds(130,100,100, 40);//x axis, y axis, width, height  

        f.add(b);//adding button in JFrame  
        f.add(checkBox1);
        f.setSize(400,500);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  
    }  
}
