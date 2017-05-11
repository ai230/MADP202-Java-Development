/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writephonelist;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author yamamotoai
 */
public class WritePhoneList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<StringBuilder> arr = new ArrayList<StringBuilder>();
        
        for(int i = 0; i < 5; i++){
            StringBuilder str = new StringBuilder("");

            Scanner scanFName = new Scanner(System.in);
            System.out.print("Input first names: ");           
            str.append(scanFName.nextLine());
            
            Scanner scanLName = new Scanner(System.in);
            System.out.print("Input last names: ");           
            str.append(", " + scanLName.nextLine());
            
            Scanner scanPhone = new Scanner(System.in);
            System.out.print("Input phone numbers: ");           
            str.append(", " + scanPhone.nextLine());
            
            arr.add(i,str);
        }
        
        System.out.println(arr.toString());
        
        //write in a file
        BufferedWriter bw = null;
        try {
            String myContent = arr.toString();
            //Specify the file name and path here
            File file = new File("WritePhoneList.txt");

            /* This logic will make sure that the file 
	  * gets created if it is not present at the
	  * specified location*/
            if  (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(myContent);
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
