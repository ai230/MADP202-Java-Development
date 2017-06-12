/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jemail;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.*;

/**
 *
 * @author yamamotoai
 */
public class JEMail extends JFrame{
    private JTextArea area;
    public JEMail() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        Container contentPane = getContentPane();
        setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        JTextField txt1 = new JTextField("TO:");
        txt1.setMaximumSize(new Dimension(Integer.MAX_VALUE, txt1.getPreferredSize().height));
        JTextField txt2 = new JTextField("Subject:");
        area = new JTextArea("Message");
        JScrollPane scroll = new JScrollPane(area);
        scroll.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        txt2.setMaximumSize(new Dimension(Integer.MAX_VALUE, txt2.getPreferredSize().height));
        JButton btn = new JButton("Send");
        btn.addActionListener(new ButtonListner());
        
        contentPane.add(txt1);
        contentPane.add(txt2);
        contentPane.add(scroll);
        contentPane.add(btn);

    }
    
    private class ButtonListner implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Exception occurred:");
            area.setText("Mail has been sent!");
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    protected static void createAndShowGUI() {
        JEMail frame = new JEMail();
        frame.setVisible(true);
    }

}
