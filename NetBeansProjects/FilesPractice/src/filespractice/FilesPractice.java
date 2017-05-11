/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filespractice;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author yamamotoai
 */
public class FilesPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("testtest.txt");
        FileOutputStream fos = null;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Input something : ");
        String str = scan.nextLine();
        System.out.println("------");
        try {
            fos = new FileOutputStream(file);
            if(!file.exists()){
                System.out.println("create file Successfully"); 
                file.createNewFile();
               
            }
            byte[] bytesArray = str.getBytes();
            
            fos.write(bytesArray);
            fos.flush();
            System.out.println("File Written Successfully");
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the Stream");
            }
        }
        
    }
    
}
