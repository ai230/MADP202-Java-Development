/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summervaleresort;

//import com.sun.java.util.jar.pack.Attribute.Layout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author yamamotoai
 */
public class SummervaleResort extends JFrame implements ActionListener {

//    private JFrame f = new JFrame("Menu and MenuItem Example");
//    private JTextArea area;

    //menubar
    private JMenuBar mb = new JMenuBar();
    //manu
    private JMenu m1 = new JMenu("File");
    private JMenu m2 = new JMenu("Roomes");
    private JMenu m3 = new JMenu("Dining");
    private JMenu m4 = new JMenu("Activities");

    //menu items
    private JMenuItem i1 = new JMenuItem("Open");
    private JMenuItem i2 = new JMenuItem("Close");
    private JMenuItem i3 = new JMenuItem("Suite");
    private JMenuItem i4 = new JMenuItem("Single");
    private JMenuItem i5 = new JMenuItem("Restaurants");
    private JMenuItem i6 = new JMenuItem("Bars");
    private JMenuItem i7 = new JMenuItem("Spa");
    private JMenuItem i8 = new JMenuItem("Room Service");

    //three labels 
    private JLabel label1 = new JLabel("Welcome to the Summervale Resort");
    private JLabel label2 = new JLabel();
    private JLabel label3 = new JLabel();
    //define three panels 
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();

    public SummervaleResort() {
        //Frame properties 
        setTitle("Summervale Resort");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));
        //Menu bar 
        setJMenuBar(mb);
        
        //Menu item actions 
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);
        i8.addActionListener(this);

        m1.add(i1);
        m1.add(i2);
        m2.add(i3);
        m2.add(i4);
        m3.add(i5);
        m3.add(i6);
        m4.add(i7);
        m4.add(i8);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        
        //Adding labels 
        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);
        //adding panels 
        add(panel1);
        add(panel2);
        add(panel3);
        
        //Set Fonts of labels 
        label1.setFont(new Font(null, Font.BOLD, 25));
        label2.setFont(new Font(null, Font.BOLD, 25));
        label3.setFont(new Font(null, Font.ITALIC, 25));
    }

    public void actionPerformed(ActionEvent e) {
        //object for inputs 
        Object source = e.getSource();
//text for labels 
        label1.setText("Summervalve Resort");
        label2.setText("-------------------------");
//input items check 
        if (source == i1) {
            label3.setText("We can provide awesome services for you");
        } else if (source == i2) {
            System.exit(0);
        } else if (source == i3) {
            label3.setText("Lovely 3-room suites from $189 per night");
        } else if (source == i4) {
            label3.setText("Lovely single rooms from $100 per night");
        } else if (source == i5) {
            label3.setText("Lovely single family dining tables");
        } else if (source == i6) {
            label3.setText("Lovely dining tables for big or small parties");
        } else if (source == i7) {
            label3.setText("We can provide good lodging facilities");
        } else if (source == i8) {
            label3.setText("We can provide good dining facilities");
        }
    }

    public static void main(String[] args) {
        SummervaleResort s = new SummervaleResort();
        
        s.setSize(550, 220);
        s.setVisible(true);
    }

}
