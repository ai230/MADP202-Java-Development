package player;


import player.Actor;
import player.Child;
import player.Musician;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yamamotoai
 */
public class UsePlayer {
    public static void main(String[] args) {
        
        Child c = new Child();
        c.play();
        
        Actor a = new Actor();
        a.play();
        
        Musician m = new Musician();
        m.play();
        
    }
}
