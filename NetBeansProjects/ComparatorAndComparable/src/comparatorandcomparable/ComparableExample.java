package comparatorandcomparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparableExample {

    public static void main(String args[]) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        Collections.sort(al);
        System.out.println("Using Comparable");
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        
        Student[] arr = new Student[3];
        arr[0] = new Student(10, "Mikey", 25);
        arr[1] = new Student(20, "Arun", 29);
        arr[2] = new Student(5, "Lisa", 35);
        
        System.out.println("demo using comparator");
        Arrays.sort(arr, ComparatorExample.RollnoComp);
        System.out.println("Employees list sorted by Salary:\n" + Arrays.toString(arr));
        System.out.println("demo using comparator");
        Arrays.sort(arr, ComparatorExample.NameComparator);
        System.out.println("Employees list sorted by Name:\n" + Arrays.toString(arr));

    }
}
