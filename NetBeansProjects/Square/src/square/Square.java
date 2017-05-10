/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

/**
 *
 * @author yamamotoai
 */
public class Square {
    private int height;
    private int width;
    protected int surfaceArea;
    
    public int computeSurfaceArea(int height, int width){
         surfaceArea = height * width;
         return surfaceArea;
    }
}
