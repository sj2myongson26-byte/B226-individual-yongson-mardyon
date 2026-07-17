/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25.activity;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Mardyon
 */
public class TodoManager {
    
      public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int choice = 0;

        while (choice != 6) {

            System.out.println("\n===== TO-DO LIST MANAGER =====");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Update a task");
            System.out.println("4. Remove a task");
            System.out.println("5. Clear all tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            
            try {
                choice = scan.nextInt();
                scan.nextLine(); // Clear newline
            }catch (Exception e) {
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
                scan.nextLine(); // Clear invalid input
                continue; // Show the menu again
            }


            switch (choice) {

                case 1:
                    System.out.print("Enter a new task: ");
                    String task = scan.nextLine();
                    tasks.add(task);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.println("\n===== TASK LIST =====");

                    if (tasks.isEmpty()) { // check if there is no existing tasks
                        System.out.println("No tasks available.");
                    } else { // display all the list of task available
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) { //check if there is no existing tasks
                        System.out.println("No tasks to update.");
                    } else {
                        System.out.println("\nCurrent Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }

                     try{
                        System.out.print("Enter the task number to update: ");
                        int index = scan.nextInt();
                        scan.nextLine();

                        if (index >= 1 && index <= tasks.size()) {
                            System.out.print("Enter the updated task: ");
                            String updatedTask = scan.nextLine();
                            tasks.set(index - 1, updatedTask);
                            System.out.println("Task updated successfully!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }catch(Exception e){
                         System.out.println("Invalid input! Please enter a valid task number.");
                         scan.nextLine(); // Clear invalid input                        
                        }
                    } 
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.println("\nCurrent Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }

                        
                    try{
                        System.out.print("Enter the task number to remove: ");
                        int removeIndex = scan.nextInt();
                        scan.nextLine();

                        if (removeIndex >= 1 && removeIndex <= tasks.size()) {
                            tasks.remove(removeIndex - 1);
                            System.out.println("Task removed successfully!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }catch(Exception e){
                        System.out.println("Invalid input! Please enter a valid task number.");
                        scan.nextLine(); // Clear invalid input                        
                        }   
                    }
                    break;

                case 5:
                    tasks.clear();
                    System.out.println("All tasks have been cleared.");
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        }

        scan.close();
    }
}
