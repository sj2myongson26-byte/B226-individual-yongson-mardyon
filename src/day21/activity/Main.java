/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day21.activity;

import java.util.Scanner;

/**
 *
 * @author Mardyon
 */
public class Main {
    

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        // Temporary object so we can use the validation methods
        UserAccount user = new UserAccount(firstName, middleName, lastName,
                                           address, "", "");

        // Email validation loop
        while (true) {
            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            if (user.setEmail(email)) {
                break;
            } else {
                System.out.println("Invalid email format. Please try again.\n");
            }
        }

        // Password validation loop
       
        while (true) {
       
               System.out.print("Enter Password: ");
               String password = sc.nextLine(); 
                   
            
            
            if (user.setPassword(password)) {
                break;
            } else {
                System.out.println("Invalid password!");
                System.out.println("Password must:");
                System.out.println("- Be at least 8 characters");
                System.out.println("- Contain at least one uppercase letter");
                System.out.println("- Contain at least one lowercase letter");
                System.out.println("- Contain at least one digit");
                System.out.println("- Contain at least one special character\n");
            }
        }

        // Display user information
        System.out.println("\n===== USER ACCOUNT INFORMATION =====");
        System.out.println("Full Name : " + user.getFirstName() + " "
                + user.getMiddleName() + " "
                + user.getLastName());
        System.out.println("Email     : " + user.getEmail());
        System.out.println("Address   : " + user.getAddress());

    
    }

    
}
