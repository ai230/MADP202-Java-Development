/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpractice;

import java.io.IOException;

/**
 *
 * @author yamamotoai
 */
public class POStester {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ProgramOfStudy pos = new ProgramOfStudy();
        
        pos.addCourse(new Course("CS", 101,"Introduction to Programing", "A-"));
        pos.addCourse(new Course("ARCH", 305,"Building Analysis", "A"));
        pos.addCourse(new Course("GER", 210,"Inttermediate German"));
        pos.addCourse(new Course("CS", 320,"Computer Architecture"));
        pos.addCourse(new Course("THE", 201,"The Theatre Experience"));
        pos.addCourse(new Course("AA", 102,"The Theatre Experience"));
        
        Course arch = pos.find("CS", 320);
        pos.addCourseAfter(arch, new Course("CS", 321, "Operating Systems"));
        Course theatre = pos.find("THE", 201);
        theatre.setGrade("A-");
        Course german = pos.find("GER", 210);
        pos.replace(german, new Course("FRE", 110, "Begining French", "B+"));
        
        Course AA = pos.find("AA", 102);
        AA.setGrade("A-");
        System.out.println(pos);
        pos.save("ProgramOfStudy");
    }
}
