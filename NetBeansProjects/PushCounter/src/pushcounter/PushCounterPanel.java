/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pushcounter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.plaf.basic.BasicOptionPaneUI;
/**
 *
 * @author yamamotoai
 */
public class PushCounterPanel extends JPanel {
    private int count;
    private JButton push;
    private JLabel label;
    
    public PushCounterPanel(){
        count = 0;
        
        push = new JButton("Push me!");
        push.addActionListener(new ButtonListner());
        
        label = new JLabel("Pushes: " + count);
        
        add(push);
        add(label);
        
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300, 40));
        
    }
    
    private class ButtonListner implements ActionListener{
        public void actionPerformed(ActionEvent event){
            count++;
            label.setText("Pushes: " + count);
        }
    }
}
