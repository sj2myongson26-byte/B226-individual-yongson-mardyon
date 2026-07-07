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
public class Mouse { //Chosen Object is Mouse
    
    // Attributes (Fields) of Mouse
    String brand; 
    String color;
    double weight;
    String type; // Wired or Wireless

    // Methods (Behaviors)
    public void click() {
        System.out.println(brand + " mouse clicked.");
    }

    public void drag() {
        System.out.println(brand + " mouse is dragging an item.");
    }

    public void scroll() {
        System.out.println(brand + " mouse is scrolling.");
    }

    // Display Attributes
    public void displayInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Weight: " + weight + " g");
        System.out.println("Type  : " + type);
    }
        
       
    }
    

