/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videostore;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yamamotoai
 */
public class JVideo  extends JFrame{
    JCheckBox checkBoxs[];
    JLabel lblTitle;
    JLabel lbl1;
    JLabel lbl2;
    JButton btn;
    
//    Array
    public static void main(String[] args){
        List<Movies> list = new ArrayList();
        
        Movies m1 = new Movies("A", 1.00);
        Movies m2 = new Movies("B", 2.00);
        Movies m3 = new Movies("C", 3.00);
        
        list.add(m1);
        list.add(m2);
        list.add(m3);
        
        JVideo frame = new JVideo(list);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 300, 200);
        frame.setTitle("Movies");
        frame.setVisible(true);
    }

    JVideo(List<Movies> list){
        
        lblTitle = new JLabel("Which movies do you want to rent?");
        lblTitle.setBounds(50,50,300,50);
        lbl1 = new JLabel(""); 
        lbl2 = new JLabel();
        btn = new JButton("Done");

        btn.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                double totalPrice = 0.00;
                
                for (int i = 0;i<list.size();i++) { 
                    if(checkBoxs[i].isSelected()){
                        totalPrice += list.get(i).getPrice(); 
                    }
                }
                lbl2.setText("Total price is $" + totalPrice);
                  
            }  
        });  
        
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));

        p.add(lblTitle);
        p.add(lbl1);
        
        checkBoxs = new JCheckBox[list.size()];
        for (int i = 0;i<list.size();i++) {  
            checkBoxs[i] = new JCheckBox (list.get(i).getName() + ", $" + list.get(i).getPrice());  
            p.add (checkBoxs[i]);  
        }
        p.add(btn);
        p.add(lbl2);
        getContentPane().add(p, BorderLayout.CENTER);
    }  
    
} 
    

