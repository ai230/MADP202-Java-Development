/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author yamamotoai
 */
public class User {
    private int songNum = 0;
        public static void main(String[] args) {
            Scanner scanNum = new Scanner(System.in);
            
            boolean isDone = false;
            
            Album album = new Album();
            User user = new User();
            CDPlayer player = new CDPlayer();
            PopMusic pm = new PopMusic();
            JazzMusic jm = new JazzMusic();
            
            while(!isDone){   
                player.showMenu();
                System.out.print("Input number: ");
                int n = scanNum.nextInt();
                switch(n){ 
                    case 0://play
                        pm.play();
                        jm.play();
                        break;
                    case 1://display
                        System.out.println("----------------------------");
                        System.out.println("1. Display");
                        System.out.println("----------------------------");
                        player.display(album);
                        break;
                    case 2://add new song
                        player.addNewSong(album);
                        break;
                    case 3://delete
                        player.display(album);//Before delete
                        System.out.println("");
                        player.delete(album);
                        System.out.println(" ------Delete succsess-------");
                        player.display(album);//After delete
                        System.out.println("");
                        break;
                    case 4://Shuffle//not working
                        player.display(album);//Before shuffle
                        player.shuffle(album);
                        
                        System.out.println(" ------Shuffle succsess-------");
                        player.display(album);//After shuffle
                        System.out.println("");
                        break;
                    case 5://CDSelector
                        Scanner scan1 = new Scanner(System.in);
                        System.out.print("Input album title: ");
                        String strAlbum = scan1.nextLine();
                        player.CDSelector(strAlbum, album);
                        break;
                    case 6://trackSelector
                        Scanner scan2 = new Scanner(System.in);
                        System.out.print("Input song title: ");
                        String strSong = scan2.nextLine();
                        player.trackSelector(strSong, album);
                        break;
                    case 7://Credit infomation
                        System.out.println("----------------------------");
                        System.out.println("7. Credit infomation");
                        System.out.println("----------------------------");
                        player.display(album);
                        Scanner scan7 = new Scanner(System.in);
                        System.out.print("Enter a number of song you want to see the info: ");
                        int index = scan7.nextInt();
                        
                        pm.info(album,index);
                        jm.info(album,index);
                        break;
                    case 8:
                        System.out.println("----------------------------");
                        System.out.println("8. Total Price");
                        System.out.println("----------------------------");
                        System.out.println("Total cost is $" + album.getTotalCost());
                        break;
                    case 9:                      
                        break;
                    case 10:
                        player.readFile(album);
                        player.display(album);
                        break;
                    case 11:
                        player.writeFile(album);
                        break;
                    case 999:
                        isDone = true;
                        System.out.println("END!!!");
                        break;
                    default:
                        break;
                }//switch
                System.out.println("");
            }//while
        
    }
}
