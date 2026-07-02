/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day12.activity;

import java.util.Scanner;

/**
 *
 * @author Mardyon
 */
public class Activity8_Yongson {
    
    
    public static void main(String[] args) {
        
       
        Scanner input = new Scanner(System.in);

        // Ask for the number of students
        System.out.println("======================================");
        System.out.println("          Average Calculator");
        System.out.println("======================================");

        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        // Ask for the number of subjects
        System.out.print("Enter number of subjects: ");
        int subjects = input.nextInt();
        input.nextLine(); // Clear the newline

        // Array to store subject names
        String[] subjectNames = new String[subjects];

        System.out.println("\nEnter subject names:");

        // Input subject names
        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = input.nextLine();
        }

        // Array to store student names
        String[] studentNames = new String[students];

        // 2D array to store grades
        int[][] grades = new int[students][subjects];

        // Array to store averages
        double[] averages = new double[students];

        // Input student names and grades
        for (int i = 0; i < students; i++) {

            System.out.println("\nName of Student " + (i + 1) + ": ");
            studentNames[i] = input.nextLine();

            System.out.println("Enter grades for each subject:");

            int total = 0;

            for (int j = 0; j < subjects; j++) {
                System.out.print(subjectNames[j] + ": ");
                grades[i][j] = input.nextInt();
                total += grades[i][j];
            }

            // Compute average
            averages[i] = (double) total / subjects;

            input.nextLine(); // Clear newline for line spaces
        }

        // Display Grades Report
        System.out.println("\n");
        System.out.println("======================================");
        System.out.println("            Grades Report");
        System.out.println("======================================");

        // Print table header
        System.out.printf("%-15s", "Student");

        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-10s", subjectNames[i]);
        }

        System.out.printf("%-10s%n", "Average");

        System.out.println("--------------------------------------------------------------");

        // Print student records
        for (int i = 0; i < students; i++) {

            System.out.printf("%-15s", studentNames[i]);

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-10d", grades[i][j]);
            }

            System.out.printf("%-10.2f%n", averages[i]);
        }
        
        
    }
    
}
