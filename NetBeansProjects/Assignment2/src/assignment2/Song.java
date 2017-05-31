/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author yamamotoai
 */
abstract class Song{

    private String title;
    private double price;
    private String artistName;
    private String albamTitle;
    private String genre;

    public Song(String title, double price, String artistName, String albamTitle, String genre) {
        this.title = title;
        this.price = price;
        this.artistName = artistName;
        this.albamTitle = albamTitle;
        this.genre = genre;
    }
    
    public Song(){
        
    }   
    
    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setAlbamTitle(String albamTitle) {
        this.albamTitle = albamTitle;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //getter
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getArtistName() {
        return artistName;
    }
    
    public String getAlbamTitle() {
        return albamTitle;
    }

    public String getGenre() {
        return genre;
    }

    abstract void play();
    
    public String toString() {
	String str = "Title: " + title + " Price: $" + price + " Artist Name: " + artistName + "    AlbamTitle: " + albamTitle + " Genre: " + genre;
        return str;
    }

}
