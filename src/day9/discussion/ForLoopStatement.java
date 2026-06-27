/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9.discussion;

/**
 *
 * @author Mardyon
 */
public class ForLoopStatement {
    
    public static void main(String[] args) {
        
        //Mini-Activity: Calculates the product of numbers from 1 to 5
        
        //Initializethe product variable
        int product = 1;
        
        //Loop from 1 to 5
        for (int i=1; i <=5; i++){
            product *=i;
        }
        
        //Print the results 
         System.out.println("The product of numbers from 1 to 5 is: " +  product);
    }
    
}
