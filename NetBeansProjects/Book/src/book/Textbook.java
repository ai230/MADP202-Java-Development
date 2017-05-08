/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author yamamotoai
 */
public class Textbook extends Book{
    private int gradeLevel;
    
    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    
    public int getGradeLevel() {
        return gradeLevel;
    }
}
