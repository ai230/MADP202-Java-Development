/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pushcounter;
import javax.swing.JFrame;
/**
 *
 * @author yamamotoai
 */
public class PushCounter {
    public static void main(String[] args){
        JFrame frame = new JFrame("Push counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        PushCounterPanel panel = new PushCounterPanel();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
