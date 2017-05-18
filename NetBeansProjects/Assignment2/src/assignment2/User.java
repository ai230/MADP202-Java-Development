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
            
            Albam albam = new Albam();
            albam.addCD(s1);
            albam.addCD(s2);
            albam.addCD(s3);
            albam.addCD(s4);
            User user = new User();
            CDPlayer player = new CDPlayer();
        
            while(!isDone){               
                System.out.print("Input number: ");
                int n = scan.nextInt();
                switch(n){
                    case 1://display
                        System.out.println("----------------------------");
                        System.out.println("1. Display");
                        System.out.println("----------------------------");
                        player.display(albam);
                        break;
                    case 2://CDSelector
                        Scanner scan1 = new Scanner(System.in);
                        System.out.print("Input album title: ");
                        String strAlbum = scan1.nextLine();
                        player.CDSelector(strAlbum, albam);
                        break;
                    case 3://trackSelector
                        Scanner scan2 = new Scanner(System.in);
                        System.out.print("Input song title: ");
                        String strSong = scan2.nextLine();
                        player.trackSelector(strSong, albam);
                        break;
                    case 4://Total Cost
                        System.out.println("----------------------------");
                        System.out.println("4. Total cost");
                        System.out.println("----------------------------");
                        
                        System.out.println("Total cost is $" + albam.getTotalCost());
                        System.out.print("");
                        break;
                    case 5:
                        System.out.println("----------------------------");
                        System.out.println("5. Read file");
                        System.out.println("----------------------------");
                        player.readFile(albam);                     
                        break;
                    case 6://delete
                        System.out.println("----------------------------");
                        System.out.println("6. Delete");
                        System.out.println("----------------------------");
                        
                        player.display(albam);//Before delete
                        System.out.println("");
                        player.delete(albam);
                        System.out.println(" ------Delete succsess-------");
                        player.display(albam);//After delete
                        System.out.println("");
                        break;
                    case 7:
                        System.out.println("----------------------------");
                        System.out.println("7. Shuffle");
                        System.out.println("----------------------------");
                        
                        player.shuffle(albam);
                        player.display(albam);//Before shuffle
                        System.out.println(" ------Shuffle succsess-------");
                        player.display(albam);
                        System.out.println("");//After shuffle
                        break;
                    case 8:
                        System.out.println("----------------------------");
                        System.out.println("8. Get next song");
                        System.out.println("----------------------------");
                        player.display(albam);
                        System.out.println("");
//                        player.getNextSong(albam);//TODO
                        break;
                    case 9:
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
