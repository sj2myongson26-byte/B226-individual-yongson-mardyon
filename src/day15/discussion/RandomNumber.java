/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day15.discussion;

/**
 *
 * @author Mardyon
 */
public class RandomNumber {
    
    public static void main(String[] args) {
        
       
        System.out.println("Lotto Numbers: ");
        for(int i=0; i<6; i++){
             int randomNumber = (int) (Math.random() * 58) + 1;
             System.out.println("[" + (i+1) + "]: " + randomNumber);
        }
       // System.out.println(randomNumber);
        
        //Lotto Simulator (6-/58)
        
        

        
        

        
        
    //casting -> 
    
    
    
    
    }
    
}


/*

//casting

        //downcasting / upcasting
        int x = 10;
        
        double num = (double) x; // upcasting -> implicit casting
        
        float y =10.5f;
        
        int num2 = (int) y; // downcasting -> explicit casting
        
        System.out.println(num2);
        //byte short int long float double




//parsing
        String x = "10x";
        String num = String.valueOf(x);
        System.out.println(num);

*/