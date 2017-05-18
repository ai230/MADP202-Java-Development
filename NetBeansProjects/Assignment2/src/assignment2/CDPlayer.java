/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterators;
/**
 *
 * @author yamamotoai
 */
public class CDPlayer {
    private int count = 1;

    //Display Songs in a albam or all of albams
    public void display(Albam albam) {
        for (Song item : albam.getAlbamList()) {       
            System.out.println(count + ") " + item);
            count++;
        }
        count = 1;
    }
    
    public void getNextSong() {
        //TODO
    }
    
    
    
    public void CDSelector(String albamTitle,Albam album) {
        System.out.println("----------------------------");
        System.out.println("2. CDAlbumSelector: '" + albamTitle + "'");
        System.out.println("----------------------------");
        for (Song item : album.getAlbamList()) {
            if(item.getAlbamTitle() == null ? albamTitle == null : albamTitle.equals(item.getAlbamTitle())){
                System.out.println(item);
            }
        }
            
    }
        
    
    public void trackSelector(String title,Albam album) {
        System.out.println("----------------------------");
        System.out.println("3. track(Song)Selector: '" + title + "'");
        System.out.println("----------------------------");
        for (Song item : album.getAlbamList()) {
            if(item.getTitle() == null ? title == null : item.getTitle().equals(title)){    
                System.out.println(item);
            }
        }
            
    }
    
    
    
    public void delete(Albam album) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number of song you want to delete: ");
        int index = scan.nextInt();
        album.getAlbamList().remove(index-1);           
    }

    public void shuffle(Albam album){       
        Collections.shuffle(album.getAlbamList());
    }
        
    public void addNewSong(Albam album){
        System.out.println("----------------------------");
        System.out.println("9. Add new song");
        System.out.println("----------------------------");
                        
        Scanner scanTitle = new Scanner(System.in);
        Scanner scanPrice = new Scanner(System.in);
        Scanner scanArtistName = new Scanner(System.in);
        Scanner scanAlbamTitle = new Scanner(System.in);
                        
        System.out.print("Enter Title of song: ");                       
        String title = scanTitle.nextLine();
        System.out.print("Enter Price of song: ");                       
        double price = scanPrice.nextDouble();
        System.out.print("Enter ArtistName of song: ");                       
        String artistName = scanArtistName.nextLine();
        System.out.print("Enter AlbamTitle of song: ");                       
        String albamTitle = scanAlbamTitle.nextLine();

        Song newSong = new Song(title , price, artistName, albamTitle);
        album.addCD(newSong);
    }
    
    //Read file and add album
    public void readFile(Albam album){
        BufferedReader br = null;
        String[] s;

        try {
            br = new BufferedReader(new FileReader("Music.txt"));

            String str = br.readLine();
            System.out.println("1)" + str);
            s = str.split(",");
            Song song1 = new Song(s[0], Double.parseDouble(s[1]), s[2], s[3]);
            album.addCD(song1);

            while (str != null) {
                str = br.readLine();
                System.out.println("2)" + str);
                if(str != null){
                    s = str.split(",");
                    Song song2 = new Song(s[0], Double.parseDouble(s[1]), s[2], s[3]);

                    album.addCD(song2);

                }
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the BufferedReader");
            }
        }
    }
    
    public void showMenu(){
        System.out.println("************************************************");
        System.out.println("******************** MENU **********************");
        System.out.println("(1) Display");
        System.out.println("(2) ");
        System.out.println("************************************************");
    }
}
