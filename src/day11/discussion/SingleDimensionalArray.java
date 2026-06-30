/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11.discussion;

/**
 *
 * @author Mardyon
 */
public class SingleDimensionalArray {
    
    public static void main(String[] args) {
        
        
    //collection of age: 24,43,35,18,28,25
    
    int[] ages = {24,43,35,18,28,25};
    
    //Simple for loop
    System.out.println("For Loop");
    for(int i=0; i < ages.length; i++){
        System.out.println(ages[i]);
    }
    
    //Enhanced for loop / for each
    System.out.println("For Each Loop:");
    
    for(int age: ages){
        System.out.println(age);
    }
    

   

    
}
}
    

