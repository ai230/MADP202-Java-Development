/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author yamamotoai
 */
public class JazzMusic extends Song implements CreditInfo{

    public JazzMusic(String CDTitle, double CDPrice, String artistName, String albamTitle, String genre) {
        super(CDTitle, CDPrice, artistName, albamTitle, genre);
    }

    public JazzMusic(){
    
    }
    
    @Override
    void play() {
        System.out.println("Play Jazz Music!!");
    }

    @Override
    public void info(Album album,int index) {
        if(album.getAlbumList().get(index-1).getGenre().contains("Jazz")){
            System.out.println("<<<JAZZ>>>");
            System.out.println("[Title] " + album.getAlbumList().get(index-1).getTitle());
            System.out.println("[Artist] " + album.getAlbumList().get(index-1).getArtistName());
            System.out.println("[Price] " + album.getAlbumList().get(index-1).getPrice());
            System.out.println("");  
        }
    }



}
