/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b10.activity;


/**
 *
 * @author Mardyon
 */
public class Activity6Part2_Yongson {
    
        public static void main(String[] args) {

        // Outer loop for each multiplication table, 
        for (int i = 1; i <= 12; i++) { // from 1 to 12
            System.out.println("Multiplication Table of " + i);

            // Inner loop for the multiples
            for (int j = 1; j <= 12; j++) { // from 1 to 12
                System.out.println(i + " * " + j + " = " + (i * j));
            }

            // Blank line between tables
            System.out.println();
        }
    }
    
}
