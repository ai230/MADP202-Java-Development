/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author yamamotoai
 */
public class Student {

    private int ID;
    private int creditHours;
    private int points;
    private int gradeAverage;
    
    public Student(int ID, int creditHours, int points){
        this.ID = ID;
        this.creditHours = creditHours;
        this.points = points;
        gradeAverage = this.points / this.creditHours;
    }
    
    public Student(){
        this.ID = 9999;
        this.creditHours = 3;
        this.points = 12;
        gradeAverage = this.points / this.creditHours;
    }
    
    public Student(int ID, int creditHours){
        this.ID = ID;
        this.creditHours = creditHours;
        this.points = 12;
        gradeAverage = this.points / this.creditHours;
    }
    
    @Override
    public String toString() {
        String description = "";
        description += "ID: \t" + ID + "\n";
        description += "CreditHours: \t" + creditHours + "\n";
        description += "Points: \t" + points + "\n";
        description += "Grade Average: \t" + gradeAverage + "\n";
        return description;
    }
    
}
