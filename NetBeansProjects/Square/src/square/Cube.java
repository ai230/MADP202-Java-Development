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
public class Cube extends Square {
   private int depth;
   
   public int computeSurfaceArea(int height, int width, int depth){
         surfaceArea = height * width * depth;
         return surfaceArea;
     }
}
