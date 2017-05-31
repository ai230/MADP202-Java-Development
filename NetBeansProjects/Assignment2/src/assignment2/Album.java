/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yamamotoai
 */
public class Album {

    private List<Song> albumList;
    private double totalCost;

    //constructor
    public Album() {
        albumList = new ArrayList<Song>();
        totalCost = 0.0;
    }

    //getter
    public List<Song> getAlbumList() {
        return albumList;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void addCD(Song s) {
        albumList.add(s);
//        String str = albamList.toString();
//        System.out.println("add:" + albamList.toString());
        this.totalCost = this.totalCost + s.getPrice();
    }
        
    public void deleteCD(String title, String track) {
        //TODO
    }

    public void shaffulCDInTheAlbam() {
        //TODO
    }

}
