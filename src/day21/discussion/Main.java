/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day21.discussion;

/**
 *
 * @author Mardyon
 */
public class Main {
    
    public static void main(String[] args) {
        
       Ballpen ballpen = new Ballpen();
       
       ballpen.setId(3);
       ballpen.setBrand("HBW");
       ballpen.setColor("Black");
       ballpen.setPrice(50.0);
       ballpen.setPointSize(8.0);
     
      System.out.println("ID: " + ballpen.getId());
      System.out.println("Brand: " + ballpen.getBrand());
      System.out.println("Color: " + ballpen.getColor());
      System.out.println("Price: " + ballpen.getPrice());
      System.out.println("Point Size: " + ballpen.getPointSize());

       
       
    }
    
}
