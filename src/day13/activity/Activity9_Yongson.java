/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day13.activity;

/**
 *
 * @author Mardyon
 */
public class Activity9_Yongson {
    
    public static void main(String[] args) {
        
         String country = "Philippines";
         
         System.out.println("Philippines");

        // Display the first and last character
        System.out.println("First character: " + country.charAt(0));
        System.out.println("Last character: " + country.charAt(country.length() - 1));

        int pCount = 0;
        int vowelCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < country.length(); i++) {
            char ch = Character.toLowerCase(country.charAt(i));

            // Count P/p
            if (ch == 'p') {
                pCount++;
            }

            // Count vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Display results
        System.out.println("Number of P/p: " + pCount);
        System.out.println("Number of vowels: " + vowelCount);
    }
        
    }
    

