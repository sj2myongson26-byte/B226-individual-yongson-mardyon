/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day15.activity;

/**
 *
 * @author Mardyon
 */
public class Activity11_Yongson {
    
    public static void main(String[] args) {
        
        int[] lottoNumbers = new int[6];
        int count = 0;

        while (count < 6) {

            // Generate a random number from 1 to 58
            int randomNumber = (int) (Math.random() * 58) + 1;

            boolean exists = false;

            // Check if the number already exists
            for (int i = 0; i < count; i++) {
                if (lottoNumbers[i] == randomNumber) {
                    exists = true;
                    break;
                }
            }

            // If unique, store it in the array
            if (!exists) {
                lottoNumbers[count] = randomNumber;
                count++;
            }
        }

       
     
        //Lotto Simulator (6-/58)
        System.out.println("Lotto Numbers:");
        // Display the 6 unique lotto numbers
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.println("[" + (i + 1) + "]: " + lottoNumbers[i]);
        }
    }
    
}
