/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package b10.activity;

import java.util.Scanner;

/**
 *
 * @author Mardyon
 */
public class Activity6Part1_Yongson {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a number input
        System.out.print("Enter the multiplication table you want to output: ");
        int number = input.nextInt();

        // Display the chosen multiplication table
        System.out.println("\nMultiplication Table of " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

     }
}
