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
public class ReadFile {
    public static void main(String[] args) {
        File file = new File("ReadFile.txt");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        
        StringBuilder str = new StringBuilder();
        
        try {
            fis = new FileInputStream(file);//FileInputStream
            bis = new BufferedInputStream(fis);//BufferedInputStream for

            //available() method of BufferedInputStream returns 0 when there are no more bytes
            while (bis.available() > 0) {
                str.append((char) bis.read());
                System.out.println(str);
            }

        } catch (IOException ioe) {
            System.out.println("I/O Exception: " + ioe);
        } finally {
            try {
                if (bis != null && fis != null) {
                    fis.close();
                    bis.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in InputStream close(): " + ioe);
            }
        }
    }
}
