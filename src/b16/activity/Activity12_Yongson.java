/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b16.activity;

import java.util.Scanner;

/**
 *
 * @author Mardyon
 */
public class Activity12_Yongson {
       

    // method to identify if a number is odd or even
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }

    // method to print your name 50 times
    public static void printName50Times() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". Mardyon Yongson");
        }
    }

    // method to get the square root of a certain variable
    public static void squareRoot(double number) {
        System.out.println("Square root of " + number + " is " + Math.sqrt(number));
    }

    // method to get the power of a number using base and exponent
    public static void power(double base, double exponent) {
        System.out.println(base + " raised to " + exponent + " = " + Math.pow(base, exponent));
    }

    // method to print a random number between 1 and 100
    public static void randomNumber() {
        int random = (int)(Math.random() * 100) + 1;
        System.out.println("Random Number: " + random);
    }

    // method to get the area of a circle using the given radius
    public static void areaOfCircle(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }

    // method to identify if a person is a voter or not
    public static void isVoter(int age) {
        if (age >= 18) {
            System.out.println("Eligible to Vote.");
        } else {
            System.out.println("Not Eligible to Vote.");
        }
    }

    // method to get the length of a certain word
    public static void wordLength(String word) {
        System.out.println("Length of the word: " + word.length());
    }

    // method to print a certain word in reverse order
    public static void reverseWord(String word) {
        System.out.print("Reversed Word: ");
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }

    // mmethod to print your full name and age
    public static void printInfo(String fullname, int age) {
        System.out.println("Full Name: " + fullname);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Odd or Even
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        oddOrEven(number);

        // Print Name 50 Times
        System.out.println("\nPrinting Name 50 Times:");
        printName50Times();

        // Square Root
        System.out.print("\nEnter a number to get its square root: ");
        double sqrtNumber = input.nextDouble();
        squareRoot(sqrtNumber);

        // Power
        System.out.print("\nEnter the base: ");
        double base = input.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = input.nextDouble();
        power(base, exponent);

        // Random Number
        System.out.println();
        randomNumber();

        // Area of Circle
        System.out.print("\nEnter the radius of the circle: ");
        double radius = input.nextDouble();
        areaOfCircle(radius);

        // Voter Eligibility
        System.out.print("\nEnter your age: ");
        int age = input.nextInt();
        isVoter(age);

        input.nextLine(); // Consume newline

        // Word Length
        System.out.print("\nEnter a word: ");
        String word = input.nextLine();
        wordLength(word);

        // Reverse Word
        reverseWord(word);

        // Full Name and Age
        System.out.print("\nEnter your full name: ");
        String fullname = input.nextLine();

        System.out.print("Enter your age: ");
        int personAge = input.nextInt();

        printInfo(fullname, personAge);
    }
}
    

