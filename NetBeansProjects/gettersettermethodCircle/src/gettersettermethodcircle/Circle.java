/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gettersettermethodcircle;

/**
 *
 * @author yamamotoai
 */
public class Circle {
    private double radius;
    private double diameter;
    private double area;
    
    public Circle() {
        this.radius = 1;

        diameter = 1;
        area = 1;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
        
        this.diameter = radius * 2;
        this.area = 3.14 * radius * radius;
    }
    
//    public void setDiameter(double diameter) {
//        this.diameter = diameter;
//    }
//    
//    public void setArea(double area) {
//        this.area = area;
//    }
    
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public double getDiameter() {
        return diameter;
    }
    
    
//    public double getDi
//   @Override
//    public String toString() {
//        String description = "";
//        description += "Title: \t" + radius + "\n";
//        description += "Author: \t" + diameter + "\n";
//        description += "Publisher: \t" + area + "\n";
//        return description;
//    }
    
}
