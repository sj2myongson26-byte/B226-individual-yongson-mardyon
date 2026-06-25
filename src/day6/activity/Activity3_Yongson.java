/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6.activity;

/**
 *
 * @author Mardyon
 */
public class Activity3_Yongson {
    
    public static void main(String[] args) {
        
        
        //Program 2
        int age = 20;
        boolean hasValidID = true;
        
        if(age >=18 && hasValidID){ // checking condition if Age is 18 or above and has valid ID
            System.out.println("Access Granted"); //output
        }
        
        //Program 3
        boolean isWeekend = true;
        boolean isHoliday = false;
        
        if(isWeekend || isHoliday){
            System.out.println("No Classes Today"); // output
        }
        
        //Program 4
        int score =85;
        System.out.println((score >=75) ? "Passed" : "Failed"); // output
        
        
        //Program 5
        int num1 = 10;
        int num2 = 25;
        System.out.println("The larger number is: " + (num1>num2 ? num1 : num2)); //output
        
        
    }
    
}
