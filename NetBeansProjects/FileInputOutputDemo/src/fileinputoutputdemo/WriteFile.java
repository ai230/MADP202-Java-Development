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
public class WriteFile {
    public static void main(String[] args) {
        
        File file = new File("MyNewFile.txt");
        
        FileOutputStream fos = null;
        String str = "I want to create a file and output!";
        
        try {
            //Create new object from FileOutputStream class
            fos = new FileOutputStream(file);

            //exists() method check if the file exists or not
            if (!file.exists()) { 
                //if not create new file
                file.createNewFile();              
            }
            
            //String content cannot be directly written into a file.
            //It needs to be converted into bytes
            byte[] bytesArray = str.getBytes();

            fos.write(bytesArray);//write into the file
            fos.flush();// ?
            System.out.println("File Written Successfully");
        } catch (IOException ioe) {//Excepytion
            ioe.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ioe) {//Excepytion for close()
                System.out.println("Error in closing the Stream");
            }
        }
    }
}
