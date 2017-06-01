
package setsample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetSample {

    public static void main(String[] args) {
        //HashSet
        System.out.println("---HashSet---");
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));
        HashSet<Integer> s3 = new HashSet<>(Arrays.asList(3,6));
        
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        
        s1.add(100);
        s1.addAll(s2);
        System.out.println("After s1.addAll(s2) s1: " + s1);
        
        //containsAll
        if(s1.containsAll(s2)) System.out.println("s1 contains all s2!!!!");
        if(s2.containsAll(s3)) System.out.println("s2 contains all s3!!!!");

        s2.removeAll(s2);
        System.out.println("After removeAll s2: " + s2);
        
        //isEmpty
        if(s1.isEmpty()) System.out.println("s1 is empty!!!!");
        if(s2.isEmpty()) System.out.println("s2 is empty!!!!");
        
        s1.retainAll(s3);
        System.out.println("After retainAll s1: " + s1);
        
        //LinkedHashSet
        System.out.println("---LinkedHashSet---");
        LinkedHashSet<Integer> l1 = new LinkedHashSet<>(Arrays.asList(2, 4, 6, 8));
        LinkedHashSet<Integer> l2 = new LinkedHashSet<>(Arrays.asList(1, 3, 5, 7, 9));
        LinkedHashSet<Integer> l3 = new LinkedHashSet<>(Arrays.asList(3,6));
        
        System.out.println("l1: " + l1);
        System.out.println("l2: " + l2);
        System.out.println("l3: " + l3);
        
        l1.add(100);
        l1.addAll(l2);

        System.out.println("After s1.addAll(s2) l1: " + l1);
        
        l2.removeAll(l2);
        System.out.println("After removeAll  l2: " + l2);
        
        l1.retainAll(l3);
        System.out.println("After retainAll l1: " + l1);
        
        //TreeSet
        System.out.println("---TreeSet---");
        Set<Integer> t1 = new TreeSet<>(Arrays.asList(2, 4, 6, 8));
        Set<Integer> t2 = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9));
        Set<Integer> t3 = new TreeSet<>(Arrays.asList(3,6));
        
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
        System.out.println("t3: " + t3);

        t1.add(100);
        t1.addAll(t2);
        System.out.println("After addAll t1: " + t1);

        t2.removeAll(t2);
        System.out.println("After removeAll t2: " + t2);
        
        t1.retainAll(t3);
        System.out.println("After retainAll t1: " + t1);
    }
    
}
