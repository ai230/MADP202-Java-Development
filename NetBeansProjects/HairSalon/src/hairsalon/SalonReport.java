/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairsalon;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yamamotoai
 */
public class SalonReport {
    public static void main(String[] args) {
        ArrayList<Service> services = new ArrayList<Service>();
        
        Service s1 = new Service("Cut", 8.00, 15);
        Service s2 = new Service("Shampoo", 4.00, 10);
        Service s3 = new Service("Manicure", 18.00, 30);
        Service s4 = new Service("Style", 48.00, 55);
        Service s5 = new Service("Permanent", 18.00, 35);
        Service s6 = new Service("Trim", 6.00, 5);
        
        services.add(s1);
	services.add(s2);
        services.add(s3);
        services.add(s4);
        services.add(s5);
        services.add(s6);

        Scanner scan = new Scanner(System.in);

        System.out.println("1) Service ascending order");
        System.out.println("2) Service descending order");
        System.out.println("3) Price ascending order");
        System.out.println("4) Price descending order");
        System.out.println("5) Time ascending order");
        System.out.println("6) Time descending order");
        System.out.print("Input number of oorder : ");
        int num = scan.nextInt();
        
        System.out.println("-------------------------");
        switch(num){
            case 1:
                System.out.println("1) Service ascending order");
                services.sort((a,b)->a.getService().compareTo(b.getService()));
                break;
            case 2:
                System.out.println("2) Service descending order");
                services.sort((a,b)->b.getService().compareTo(a.getService()));
                break;
            case 3:
                System.out.println("3) Price ascending order");
                services.sort((a,b)-> a.getPrice()- b.getPrice());
                break;
            case 4:
                System.out.println("4) Price descending order");
                services.sort((a,b)-> b.getPrice()- a.getPrice());
                break;
            case 5:
                System.out.println("5) Time ascending order");
                services.sort((a,b)-> a.getTime() - b.getTime());
                break;
            case 6:
                System.out.println("6) Time descending order");
                services.sort((a,b)-> b.getTime() - a.getTime());
                break;
            default:
                break;
        }
        System.out.println("-------------------------");
        for(int i = 0; i < services.size(); i++){
            System.out.println(services.get(i).toString());
        }
        
    }
}
