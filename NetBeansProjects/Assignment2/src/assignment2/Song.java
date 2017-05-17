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
public class Song extends Albam{

    private String title;
    private double price;
    private String artistName;
    private String albamTitle;

    public Song(String title, double price, String artistName, String albamTitle) {
        this.title = title;
        this.price = price;
        this.artistName = artistName;
        this.albamTitle = albamTitle;
        System.out.println("song:" + this.title);
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

    //setter
    public void setAlbamTitle(String albamTitle) {
        this.albamTitle = albamTitle;
    }

//    abstract void saySomething();
    //getter
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAlbamTitle() {
        return albamTitle;
    }

    
    
    public String toString() {
	String str = "Title: " + title + " Price: $" + price + " Artist Name: " + artistName + " albamTitle: " + albamTitle;
        return str;
    }

}
