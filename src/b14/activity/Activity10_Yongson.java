/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b14.activity;

/**
 *
 * @author Mardyon
 */
public class Activity10_Yongson {
    
    public static void main(String[] args) {
        
        // ==========================================================
        // Math.abs() - Returns the absolute (positive) value.
        // ==========================================================
        System.out.println("1. Math.abs()");
        int negativeNumber = -25;
        System.out.println("Absolute value of " + negativeNumber + " = "
                + Math.abs(negativeNumber));

        // ==========================================================
        // Math.max() - Returns the larger of two values.
        // ==========================================================
        System.out.println("\n2. Math.max()");
        int a = 45;
        int b = 60;
        System.out.println("Maximum value between " + a + " and " + b
                + " = " + Math.max(a, b));

        // ==========================================================
        // Math.min() - Returns the smaller of two values.
        // ==========================================================
        System.out.println("\n3. Math.min()");
        System.out.println("Minimum value between " + a + " and " + b
                + " = " + Math.min(a, b));

        // ==========================================================
        // Math.pow() - Raises a number to a specified power.
        // ==========================================================
        System.out.println("\n4. Math.pow()");
        System.out.println("2 raised to the power of 5 = "
                + Math.pow(2, 5));

        // ==========================================================
        // Math.sqrt() - Returns the square root of a number.
        // ==========================================================
        System.out.println("\n5. Math.sqrt()");
        System.out.println("Square root of 81 = "
                + Math.sqrt(81));

        // ==========================================================
        // Math.round() - Rounds to the nearest whole number.
        // ==========================================================
        System.out.println("\n6. Math.round()");
        double number1 = 7.6;
        System.out.println(number1 + " rounded = "
                + Math.round(number1));

        // ==========================================================
        // Math.ceil() - Rounds a decimal number upward.
        // ==========================================================
        System.out.println("\n7. Math.ceil()");
        double number2 = 5.2;
        System.out.println("Ceiling of " + number2 + " = "
                + Math.ceil(number2));

        // ==========================================================
        // Math.floor() - Rounds a decimal number downward.
        // ==========================================================
        System.out.println("\n8. Math.floor()");
        System.out.println("Floor of " + number2 + " = "
                + Math.floor(number2));

        // ==========================================================
        // Math.random() - Generates a random number between 0.0 and 1.0.
        // ==========================================================
        System.out.println("\n9. Math.random()");
        System.out.println("Random number = "
                + Math.random());

        // ==========================================================
        // Math.log() - Returns the natural logarithm (base e).
        // ==========================================================
        System.out.println("\n10. Math.log()");
        System.out.println("Natural log of 10 = "
                + Math.log(10));

        // ==========================================================
        // Math.log10() - Returns the logarithm with base 10.
        // ==========================================================
        System.out.println("\n11. Math.log10()");
        System.out.println("Log base 10 of 1000 = "
                + Math.log10(1000));

        // ==========================================================
        // Math.exp() - Returns e raised to the specified power.
        // ==========================================================
        System.out.println("\n12. Math.exp()");
        System.out.println("e raised to the power of 2 = "
                + Math.exp(2));

        // ==========================================================
        // Math.sin() - Returns the sine of an angle in radians.
        // Math.toRadians() converts degrees to radians.
        // ==========================================================
        System.out.println("\n13. Math.sin()");
        double angle = 30;
        System.out.println("Sin(30°) = "
                + Math.sin(Math.toRadians(angle)));

        // ==========================================================
        // Math.cos() - Returns the cosine of an angle in radians.
        // ==========================================================
        System.out.println("\n14. Math.cos()");
        System.out.println("Cos(60°) = "
                + Math.cos(Math.toRadians(60)));

        // ==========================================================
        // Math.tan() - Returns the tangent of an angle in radians.
        // ==========================================================
        System.out.println("\n15. Math.tan()");
        System.out.println("Tan(45°) = "
                + Math.tan(Math.toRadians(45)));
        
        
    }
    
}
