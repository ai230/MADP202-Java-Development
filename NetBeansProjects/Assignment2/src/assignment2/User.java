/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author yamamotoai
 */
public class User {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            
            boolean isDone = false;
            Song s1 = new Song("A" , 10.99, "Ai", "AlbamTitle1");
            Song s2 = new Song("B" , 10.99, "Ai2", "AlbamTitle2");
            
//            List<Song> list = new ArrayList<Song>();
//            list.add(s1);
//            list.add(s2);
            
            Albam albam = new Albam();
            albam.addCD(s1);
            albam.addCD(s2);
            User user = new User();
            CDPlayer player = new CDPlayer();
        
            while(!isDone){               
                System.out.print("Input number: ");
                int n = scan.nextInt();
                switch(n){
                    case 1:
                        albam.getAlbamList();
//                        player.display(albam);
                        break;
                    case 2:
                        Scanner scan1 = new Scanner(System.in);
                        System.out.print("Input album title: ");
                        String strAlbum = scan1.nextLine();
                        player.CDSelector(strAlbum, albam);
                        break;
                    case 3:
                        Scanner scan2 = new Scanner(System.in);
                        System.out.print("Input song title: ");
                        String strSong = scan2.nextLine();
                        player.trackSelector(strSong, albam);
                        break;
                    case 4:
                        System.out.print("Total cost is $" + albam.getTotalCost());
                        break;
                    case 5:
//                        player.readFile();//not yet
                        break;
                    case 9:
                        isDone = true;
                        System.out.print("END!!!");
                        break;
                    default:
                        break;
                }//switch
                System.out.println("");
            }//while
        
    }
}
