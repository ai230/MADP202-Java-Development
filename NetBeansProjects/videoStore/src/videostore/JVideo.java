/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videostore;

import javax.swing.*;
import java.awt.Font;
import java.awt.BorderLayout;

/**
 *
 * @author yamamotoai
 */
public class JVideo  extends JFrame{
    JCheckBox checkBoxs[];
//    Array
    public static void main(String[] args){
        JVideo frame = new JVideo();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 300, 200);
        frame.setTitle("Movies");
        frame.setVisible(true);
    }

    JVideo(){
        
        
        JCheckBox c1 = new JCheckBox("Check");

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));

        p.add(c1);

        checkBoxs = new JCheckBox[5];
        for (int i = 0;i<5;i++) {  
            checkBoxs[i] = new JCheckBox ("Button " + (i + 1));  
            p.add (checkBoxs[i]);  
        }
        getContentPane().add(p, BorderLayout.CENTER);
  }
} 
    

