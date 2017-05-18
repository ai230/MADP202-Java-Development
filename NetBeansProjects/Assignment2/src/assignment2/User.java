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
            Scanner scan = new Scanner(System.in);
            
            boolean isDone = false;
            Song s1 = new Song("A" , 10.99, "Ai", "AlbamTitle1");
            Song s2 = new Song("B" , 10.99, "Ai2", "AlbamTitle2");
            Song s3 = new Song("C" , 10.99, "Ai", "AlbamTitle1");
            Song s4 = new Song("D" , 10.99, "Ai2", "AlbamTitle2");
//            List<Song> list = new ArrayList<Song>();
//            list.add(s1);
//            list.add(s2);
            
            Albam album = new Albam();
            album.addCD(s1);
            album.addCD(s2);
            album.addCD(s3);
            album.addCD(s4);
            User user = new User();
            CDPlayer player = new CDPlayer();
        
            while(!isDone){               
                System.out.print("Input number: ");
                player.showMenu();
                int n = scan.nextInt();
                switch(n){
                    case 1://display
                        System.out.println("----------------------------");
                        System.out.println("1. Display");
                        System.out.println("----------------------------");
                        player.display(album);
                        break;
                    case 2://CDSelector
                        Scanner scan1 = new Scanner(System.in);
                        System.out.print("Input album title: ");
                        String strAlbum = scan1.nextLine();
                        player.CDSelector(strAlbum, album);
                        break;
                    case 3://trackSelector
                        Scanner scan2 = new Scanner(System.in);
                        System.out.print("Input song title: ");
                        String strSong = scan2.nextLine();
                        player.trackSelector(strSong, album);
                        break;
                    case 4://Total Cost
                        System.out.println("----------------------------");
                        System.out.println("4. Total cost");
                        System.out.println("----------------------------");
                        
                        System.out.println("Total cost is $" + album.getTotalCost());
                        System.out.print("");
                        break;
                    case 5:
                        System.out.println("----------------------------");
                        System.out.println("5. Read file");
                        System.out.println("----------------------------");
                        player.readFile(album);                     
                        break;
                    case 6://delete
                        System.out.println("----------------------------");
                        System.out.println("6. Delete");
                        System.out.println("----------------------------");
                        
                        player.display(album);//Before delete
                        System.out.println("");
                        player.delete(album);
                        System.out.println(" ------Delete succsess-------");
                        player.display(album);//After delete
                        System.out.println("");
                        break;
                    case 7://Shuffle
                        System.out.println("----------------------------");
                        System.out.println("7. Shuffle");
                        System.out.println("----------------------------");
                        
                        player.shuffle(album);
                        player.display(album);//Before shuffle
                        System.out.println(" ------Shuffle succsess-------");
                        player.display(album);
                        System.out.println("");//After shuffle
                        break;
                    case 8:
                        System.out.println("----------------------------");
                        System.out.println("8. Get next song");
                        System.out.println("----------------------------");
                        player.display(album);
                        System.out.println("");
//                        player.getNextSong(albam);//TODO
                        break;
                    case 9:
                        player.addNewSong(album);
                        break;
                    case 0:
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
