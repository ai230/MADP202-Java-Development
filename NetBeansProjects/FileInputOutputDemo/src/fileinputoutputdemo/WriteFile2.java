/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputoutputdemo;

import java.io.*;

/**
 *
 * @author yamamotoai
 */
public class WriteFile2 {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            String mycontent = "I want to create a file and output!";
            
            File file = new File("MyNewFile2.txt");

            //exists() method check if the file exists or not
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(mycontent);
            System.out.println("File written Successfully");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
    }
}
