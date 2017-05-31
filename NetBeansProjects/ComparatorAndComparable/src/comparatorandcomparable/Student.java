/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorandcomparable;

/**
 *
 * @author yamamotoai
 */
public class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
//        @Override
    public int compareTo(Student s) {
        //let's sort the employee based on id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
        return ( s.age -this.age);
    }

//    @Override
    //this is required to print the user friendly information about the Employee
    public String toString() {
        return "[Rollno=" + this.rollno + ", name=" + this.name + ", age=" + this.age + "]\n";
    }
}
