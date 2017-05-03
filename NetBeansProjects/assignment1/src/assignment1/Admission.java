/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.Scanner;
/**
 *
 * @author yamamotoai
 */
public class Admission {
    public static void main(String[] args) {
        //4)
        /*A. Write an application for a college’s admissions office. Prompt the user 
        for a student’s numeric high school grade point average (for example, 3.2) 
        and an admission test score from 0 to 100. Display the message “Accept” 
        if the student has any of the following:
        u A grade point average of 3.0 or above and an admission test score of at least 60
        u A grade point average below 3.0 and an admission test score of at least 80
        If the student does not meet either of the qualification criteria, display “Reject”.
        Save the file as Admission.java.
        
        b. Modify the application in Exercise a so that if a user enters a grade point average 
        under 0 or over 4.0, or a test score under 0 or over 100, an error message appears 
        instead of the “Accept” or “Reject” message. Save the file as Admission2.java.*/
        
        Scanner promptGradeAverage = new Scanner(System.in);
        System.out.println("Input a student’s numeric high school grade point average : ");
        float gradeAverage = promptGradeAverage.nextFloat();
        
        Scanner promptAdmissionScore = new Scanner(System.in);
        System.out.println("Input an admission test score from 0 to 100 : ");
        int admissionScore = promptAdmissionScore.nextInt();
        
        
        if((gradeAverage >= 3.0 && admissionScore >= 60) || (gradeAverage < 3.0 && admissionScore >= 80)){
            System.out.println("Accept");
        }else{
            System.out.println("Reject");
        }
    }
}
