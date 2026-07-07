/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day17.activity;

/**
 *
 * @author Mardyon
 */
public class Main {
    
    public static void main(String[] args) {

        // Create Mouse Objects
        Mouse mouse1 = new Mouse();
        Mouse mouse2 = new Mouse();
        Mouse mouse3 = new Mouse();

        // Assign values to mouse1
        mouse1.brand = "Logitech";
        mouse1.color = "Black";
        mouse1.weight = 85.5;
        mouse1.type = "Wireless";

        // Assign values to mouse2
        mouse2.brand = "Blue";
        mouse2.color = "White";
        mouse2.weight = 92.0;
        mouse2.type = "Wired";

        // Assign values to mouse3
        mouse3.brand = "HP";
        mouse3.color = "Red";
        mouse3.weight = 78.3;
        mouse3.type = "Wireless";

        // Display Mouse 1
        System.out.println("=== Mouse 1 ===");
        mouse1.displayInfo();
        mouse1.click();
        mouse1.drag();
        mouse1.scroll();

        // Display Mouse 2
        System.out.println("\n=== Mouse 2 ===");
        mouse2.displayInfo();
        mouse2.click();
        mouse2.drag();
        mouse2.scroll();

        // Display Mouse 3
        System.out.println("\n=== Mouse 3 ===");
        mouse3.displayInfo();
        mouse3.click();
        mouse3.drag();
        mouse3.scroll();
    }
    
}
