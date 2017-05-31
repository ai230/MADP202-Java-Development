package comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yamamotoai
 */
public abstract class ComparatorExample implements Comparator {

     public  static Comparator<Student> RollnoComp = new Comparator<Student>(){
        @Override
        public int compare(Student e1, Student e2){
            return (int)(e1.getRollno()-e2.getRollno());
            
        }
    };
    
     public static Comparator<Student> AgeComparator = new Comparator<Student>() {

        @Override
        public int compare(Student e1, Student e2) {
            return e1.getAge() - e2.getAge();
        }
    };
     public static Comparator<Student> NameComparator = new Comparator<Student>() {

        @Override
        public int compare(Student e1, Student e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
     
}
