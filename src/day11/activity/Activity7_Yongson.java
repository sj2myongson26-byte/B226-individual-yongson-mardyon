/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11.activity;

import java.util.Scanner;

/**
 *
 * @author Mardyon
 */
public class Activity7_Yongson {
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;
        double average;

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        // Display entered numbers
        System.out.println("\nYou entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // Compute average
        average = (double) sum / numbers.length;

        // Find highest and lowest
        int highest = numbers[0];
        int lowest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }

            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        // Display results
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Highest Number = " + highest);
        System.out.println("Lowest Number = " + lowest);
    }
    
}
