/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFXSwingApplication5;

//import java.awt.BorderLayout;
import java.util.Enumeration;
import javax.swing.*;

/**
 *
 * @author yamamotoai
 */


public class JavaFXSwingApplication5 extends JFrame {
     
    /** Creates new form MainFrame */
    public JavaFXSwingApplication5() {
        initComponents();
        this.setSize(400, 320);
        this.setLocation(300, 200);
        this.setTitle("JInsurance.java");
        this.setVisible(true);
    }
     
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;
 
        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jPanel4 = new JPanel();
        jlabel = new JLabel();
        jPanel2 = new JPanel();
        jCheckBox1 = new JCheckBox();
        jCheckBox2 = new JCheckBox();
        
        jPanel3 = new JPanel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jLabel1 = new JLabel();
 
        jTextField1 = new JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
 
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
 
        jButton1.setText("Check status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
 
        jPanel1.add(jButton1);
 
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            } 
        });
        jPanel1.add(jButton2);
        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);
        
//        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
//        jlabel.setText("<< Insuranse option >>");
//        jPanel4.add(jlabel);
//        getContentPane().add(jPanel4, java.awt.BorderLayout.NORTH);
        
        //panel2
        jPanel2.setLayout(new java.awt.GridLayout(2, 0));
        
        

        jCheckBox1.setText("Dental $75/m");
        jPanel2.add(jCheckBox1);
        jCheckBox2.setText("Vision $20/m");
        jPanel2.add(jCheckBox2);
        
        jPanel3.setLayout(new java.awt.GridLayout(4, 0));
        jPanel3.setBorder(new javax.swing.border.TitledBorder("Organization"));
        jPanel3.setSize(400, 300);
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("HMO $200/m");
        jPanel3.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("PPO $600/m");
        jPanel3.add(jRadioButton2);

        
        
        
        
        jPanel2.add(jPanel3);
        
        jPanel2.add(jTextField1);
        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);
        jLabel1.setText("Status");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, java.awt.BorderLayout.SOUTH);
        
        
        pack();
    }//End initComponents
 
    // Close Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }
 
    // Show status Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StringBuilder status = new StringBuilder();
        if (jCheckBox1.isSelected()) {
            status.append("Dental insurance ");
            jTextField1.setText(jTextField1.getText() + "\n Dental insurance");
        }
 
        if (jCheckBox2.isSelected()) {
            status.append("Vision insurance ");
            jTextField1.setText(jTextField1.getText() + "\n Vision insurance");
        }
         
        Enumeration<AbstractButton> e = buttonGroup1.getElements();
        while (e.hasMoreElements()) {
            JRadioButton rb = (JRadioButton)e.nextElement();
            if (rb.isSelected()) {
                status.append(rb.getText());
            }
        }
        jLabel1.setText(status.toString());
    }
     
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }
     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
   
    public static void main(String[] args) {
        new JavaFXSwingApplication5();
    }
    
}


        
                

