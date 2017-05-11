/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filestatistics;
import java.io.*;
//import java.io.File;
import java.text.SimpleDateFormat;
/**
 *
 * @author yamamotoai
 */
public class FileStatistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("FileStatistics.txt");
        
        FileOutputStream fos = null;
        String str = "This is new file output.";
        
        try {
            fos = new FileOutputStream(file);
            
            if(!file.exists()) {
                file.createNewFile();
            }
            byte[] bytesArray = str.getBytes();
            fos.write(bytesArray);
            fos.flush();
            System.out.println("File Written Successfully");
        } catch(IOException ioe) {
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
        System.out.println("----------");
        System.out.println("Name: " + file.getName());
        
        double bytes = file.length();
        System.out.println("Size: " + bytes + "byte");
        
        String absolutePath = file.getAbsolutePath();
    	System.out.println("File path : " + absolutePath);
            
        String folder = file.getAbsoluteFile().getParentFile().getName();
        System.out.println("Folder name : " + folder);
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("time of last modification : " + sdf.format(file.lastModified()));
    }
    
}
