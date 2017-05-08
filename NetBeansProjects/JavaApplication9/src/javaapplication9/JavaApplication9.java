/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author yamamotoai
 */
public class JavaApplication9 {
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
         
      
        services.sort((a,b)-> a.price - b.price ); /*ラムダ式*/
//    System.out.println( al );
//        for(int i = 0; i < services.size(); i++) {
//            Service s = services.get(i);
//            System.out.println(s.toString());
//        }
//    Service s =(Service)s.next();  
//          String str = s. 
    System.out.println(services);  
    } 

}
