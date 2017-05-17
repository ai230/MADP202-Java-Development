/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterators;
/**
 *
 * @author yamamotoai
 */
public class CDPlayer {
    
    //Display Songs in a albam or all of albams
    public void display(Albam albam) {
        for (Song item : albam.getAlbamList()) {
            System.out.println(item);
        }
    }
    
    public void getNextSong() {
        //TODO
    }
    
    
    
    public void CDSelector(String albamTitle,Albam album) {
        System.out.println("----------------------------");
        System.out.println("CDSelector: '" + albamTitle + "'");
        System.out.println("----------------------------");
        for (Song item : album.getAlbamList()) {
            if(item.getAlbamTitle() == albamTitle){    
                System.out.println(item);
            }
        }
            
    }
        
    
    public void trackSelector(String title,Albam album) {
        System.out.println("----------------------------");
        System.out.println("trackSelector: '" + title + "'");
        System.out.println("----------------------------");
        for (Song item : album.getAlbamList()) {     
            if(item.getTitle() == title){    
                System.out.println(item);
            }
        }
            
    }

    //Read file and add album
//    public void readFile(){
//        BufferedReader br = null;
//        List<Song> list = new ArrayList();
//        Albam album = new Albam();
//        String[] s;
//
//        try {
//            br = new BufferedReader(new FileReader("Music.txt"));
//
//            String str = br.readLine();
//            System.out.println("1)" + str);
//            s = str.split(",");
//            Song song1 = new Song(s[0], Double.parseDouble(s[1]), s[2], s[3]);
//            album.addCD(song1);
//
//            while (str != null) { // why stri = null goes here????
//                str = br.readLine();
//                System.out.println("2)" + str);
//                if(str != null){
//                    s = str.split(",");
//                    Song song2 = new Song(s[0], Double.parseDouble(s[1]), s[2], s[3]);
//                    System.out.println("2)----------------------");
//                    list = album.addCD(song2);
//                    System.out.println("List" + list.toString());
//                }
//            }
//            System.out.println("----------------------");
//            for(int i = 0; i < list.size(); i++){
//                System.out.println("");
//                System.out.println(list);
//            }
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        } finally {
//            try {
//                if (br != null) {
//                    br.close();
//                }
//            } catch (IOException ioe) {
//                System.out.println("Error in closing the BufferedReader");
//            }
//        }
//    }
    
    
}
