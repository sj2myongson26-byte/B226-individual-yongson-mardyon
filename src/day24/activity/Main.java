/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day24.activity;

import java.util.Scanner;

/**
 *
 * @author Mardyon
 */
public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== Savings Account Input =====
        System.out.println("=== Enter Savings Account Details ===");

        System.out.print("Account Number: ");
        String saNumber = sc.nextLine();

        System.out.print("Account Holder: ");
        String saHolder = sc.nextLine();

        System.out.print("Initial Balance: ");
        double saBalance = sc.nextDouble();

        System.out.print("Interest Rate (%): ");
        double interest = sc.nextDouble();

        SavingsAccount savings = new SavingsAccount(saNumber, saHolder, saBalance, interest);

        savings.displayAccountInfo();

        System.out.print("\nEnter Deposit Amount: ");
        double deposit = sc.nextDouble();
        savings.deposit(deposit);

        System.out.print("\nEnter Withdrawal Amount: ");
        double withdraw = sc.nextDouble();
        savings.withdraw(withdraw);

        sc.nextLine(); // consume newline

        // ===== Checking Account Input =====
        System.out.println("\n=== Enter Checking Account Details ===");

        System.out.print("Account Number: ");
        String caNumber = sc.nextLine();

        System.out.print("Account Holder: ");
        String caHolder = sc.nextLine();

        System.out.print("Initial Balance: ");
        double caBalance = sc.nextDouble();

        System.out.print("Overdraft Limit: ");
        double overdraft = sc.nextDouble();

        CheckingAccount checking = new CheckingAccount(caNumber, caHolder, caBalance, overdraft);

        checking.displayAccountInfo();

        System.out.print("\nEnter Deposit Amount: ");
        deposit = sc.nextDouble();
        checking.deposit(deposit);

        System.out.print("\nEnter Withdrawal Amount: ");
        withdraw = sc.nextDouble();
        checking.withdraw(withdraw);

        sc.close();
    }
}
    

