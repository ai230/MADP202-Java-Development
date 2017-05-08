/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author yamamotoai
 */
public class test {

    public static void main(String args[]) {
               ArrayList<String> obj = new ArrayList<String>();
          obj.add("Ajeet");
	  obj.add("Harry");
	  obj.add("Chaitanya");
	  obj.add("Steve");
	  obj.add("Anuj");
          
          obj.sort((p1, p2) -> p2.compareTo(p1));
          System.out.println(obj);
         
    }
}
