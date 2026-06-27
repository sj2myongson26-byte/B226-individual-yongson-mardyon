/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9.activity;

import java.util.Scanner;


/**
 *
 * @author Mardyon
 */
public class Activity5_Yongson {
    
    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ==========================
        // Activity 5.1 - Sum of 1 to N
        // ==========================
        System.out.println("=== Activity 5.1 - Sum of 1 to N ===");

        System.out.print("Enter N: ");
        int n = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }

        System.out.println("Final Sum: " + sum);

        // ==========================
        // Activity 5.2 - Product of 1 to N
        // ==========================
        System.out.println("\n=== Activity 5.2 - Product of 1 to N ===");

        System.out.print("Enter N: ");
        n = input.nextInt();

        long product = 1;

        for (int i = 1; i <= n; i++) {
            product *= i;
            System.out.println("i = " + i + ", product = " + product);
        }

        System.out.println("Final Product: " + product);

        // ==========================
        // Activity 5.3 - Arithmetic Sequence (Sum Only)
        // ==========================
        System.out.println("\n=== Activity 5.3 - Arithmetic Sequence (Sum Only) ===");

        System.out.print("Enter starting number: ");
        int startNumber = input.nextInt();

        System.out.print("Enter common difference: ");
        int commonDifference = input.nextInt();

        System.out.print("Enter number of terms: ");
        n = input.nextInt();

        sum = 0;
        int current = startNumber;

        System.out.print("Sequence: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(current);

            sum += current;

            if (i < n) {
                System.out.print(" + ");
            }

            current += commonDifference;
        }

        System.out.println(" = " + sum);

        // ==========================
        // Activity 5.4 - Arithmetic Sequence (Sum and Product)
        // ==========================
        System.out.println("\n=== Activity 5.4 - Arithmetic Sequence (Sum and Product) ===");

        System.out.print("Enter starting number: ");
        startNumber = input.nextInt();

        System.out.print("Enter common difference: ");
        commonDifference = input.nextInt();

        System.out.print("Enter number of terms: ");
        n = input.nextInt();

        sum = 0;
        product = 1;

        current = startNumber;

        System.out.print("Sum: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(current);

            sum += current;

            if (i < n) {
                System.out.print(" + ");
            }

            current += commonDifference;
        }

        System.out.println(" = " + sum);

        current = startNumber;

        System.out.print("Product: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(current);

            product *= current;

            if (i < n) {
                System.out.print(" * ");
            }

            current += commonDifference;
        }

        System.out.println(" = " + product);

        input.close();
    }

    
}
