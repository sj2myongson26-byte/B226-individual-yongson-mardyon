/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day17.discussion;

/**
 *
 * @author Mardyon
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        //Instantiation
       Ballpen ballpen = new Ballpen();
       
       ballpen.brand = "HBW";
       ballpen.color = "Black";
       ballpen.pointSize = 0.5f;
       ballpen.weightInGrams =8;
       
       System.out.println("Brand: " + ballpen.brand);
       System.out.println("Color: " + ballpen.color);
       System.out.println("Point in Size: " + ballpen.pointSize);
       System.out.println("Weight in Grams: " + ballpen.weightInGrams);
       
       //ballpen.write();
       //ballpen.draw();
       //ballpen.sketch();
       
       
       Ballpen ballpen2 = new Ballpen();
       
       ballpen.brand = "Panda";
       ballpen.color = "Blue";
       ballpen.pointSize = 1f;
       ballpen.weightInGrams =10;
      // ballpen.draw();
      // ballpen2.sketch();
             
       Ballpen ballpen3 = new Ballpen();
       
       ballpen3.brand = "Panda";
       ballpen3.color = "Blue";
       ballpen3.pointSize = 1f;
       ballpen3.weightInGrams =10;
     //  ballpen3.sketch();
                    
       
        
    }
    
}
