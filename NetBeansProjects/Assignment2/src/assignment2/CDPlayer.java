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

    public void showMenu() {
        System.out.println("************************************************");
        System.out.println("******************** MENU **********************");
        System.out.println("************************************************");
        System.out.println("(1) Display all songs");
        System.out.println("(2) Add a new Song");
        System.out.println("(3) Select a song and delete");
//        System.out.println("(4) Shuffle the songs");
        System.out.println("(5) Album selector");
        System.out.println("(6) Song selector");
        System.out.println("(7) Credit infomation");
        System.out.println("(8) Total Price");
        System.out.println("(10) Read from a file");
        System.out.println("(11) Output into a file");
        System.out.println("(999) Close");
        System.out.println("************************************************");
    }

    //Display Songs in a albam or all of albams
    public void display(Album album) {
        for (Song item : album.getAlbumList()) {
            System.out.println(count + ") " + item);
            count++;
        }
        count = 1;
    }

    public void addNewSong(Album album) {
        System.out.println("----------------------------");
        System.out.println("2. Add new song");
        System.out.println("----------------------------");

        Scanner scanTitle = new Scanner(System.in);
        Scanner scanPrice = new Scanner(System.in);
        Scanner scanArtistName = new Scanner(System.in);
        Scanner scanAlbamTitle = new Scanner(System.in);
        Scanner scanGenre = new Scanner(System.in);
        System.out.print("Enter Title of song: ");
        String title = scanTitle.nextLine();
        System.out.print("Enter Price of song: ");
        double price = scanPrice.nextDouble();
        System.out.print("Enter ArtistName of song: ");
        String artistName = scanArtistName.nextLine();
        System.out.print("Enter AlbamTitle of song: ");
        String albamTitle = scanAlbamTitle.nextLine();
        System.out.print("Which genre? 1)Pop 2)Jazz ");
        int albamGenre = scanGenre.nextInt();

        if (albamGenre == 1) {
            PopMusic newSong = new PopMusic(title, price, artistName, albamTitle, "Pop");
            album.addCD(newSong);
        } else if (albamGenre == 2) {
            JazzMusic newSong = new JazzMusic(title, price, artistName, albamTitle, "Jazz");
            album.addCD(newSong);
        } else {
            System.out.println("Enter 1 or 2");
        }

    }

    public void delete(Album album) {
        System.out.println("----------------------------");
        System.out.println("3. Delete");
        System.out.println("----------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number of song you want to delete: ");
        int index = scan.nextInt();
        album.getAlbumList().remove(index - 1);
    }

    public void shuffle(Album album) {
        System.out.println("----------------------------");
        System.out.println("4. Shuffle");
        System.out.println("----------------------------");
        Collections.shuffle(album.getAlbumList());
    }

    public void CDSelector(String albamTitle, Album album) {
        System.out.println("----------------------------");
        System.out.println("5. AlbumSelector: '" + albamTitle + "'");
        System.out.println("----------------------------");
        for (Song item : album.getAlbumList()) {
            if (item.getAlbamTitle().contains(albamTitle)) {
                System.out.println(item);
            }
        }
    }

    public void trackSelector(String title, Album album) {
        System.out.println("----------------------------");
        System.out.println("6. Song Selector: '" + title + "'");
        System.out.println("----------------------------");
        for (Song item : album.getAlbumList()) {
            if (item.getTitle().contains(title)) {
                System.out.println(item);
            }
        }
    }
    
    
    //Read file and add album
    public void readFile(Album album) {
        System.out.println("----------------------------");
        System.out.println("10. Read file");
        System.out.println("----------------------------");

        BufferedReader br = null;
        String[] s;

        try {
            br = new BufferedReader(new FileReader("Music.txt"));

            String str = br.readLine();
            s = str.split(",");
            this.addSong(s, album);;

            while (str != null) {
                str = br.readLine();
                if (str != null) {
                    s = str.split(",");
                    this.addSong(s, album);
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

    //This is for reading files 
    private void addSong(String[] s, Album album) {

        if (s[4].contains("Pop")) {
            PopMusic song1 = new PopMusic(s[0], Double.parseDouble(s[1]), s[2], s[3], s[4]);
            album.addCD(song1);
        } else if (s[4].contains("Jazz")) {
            JazzMusic song1 = new JazzMusic(s[0], Double.parseDouble(s[1]), s[2], s[3], s[4]);
            album.addCD(song1);
        } else {
            System.out.println("Error" + s[4]);
        }
    }
    
    
    public void writeFile(Album album){
        BufferedWriter bw = null;
        try {
            StringBuffer strB = new StringBuffer();
            String str = "";
            File file = new File("MyMusic.txt");
            for (Song item : album.getAlbumList()) {
//                str += str.toString();
                str += (count + ") " + item + "\n");
                count++;
            }
            
            

            //exists() method check if the file exists or not
            if (!file.exists()) {
                file.createNewFile();
            }
            for (Song item : album.getAlbumList()) {
                FileWriter fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
                bw.write(str);
                count++;
            }
            count = 1;
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
