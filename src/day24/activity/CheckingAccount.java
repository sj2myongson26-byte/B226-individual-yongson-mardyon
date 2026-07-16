/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day24.activity;

/**
 *
 * @author Mardyon
 */

public class CheckingAccount extends Account implements Transaction {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("\n---Checking Account Info--\n");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("\nDeposited " + amount + " into Checking Account");
        System.out.println("New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("\nWithdrew " + amount + " from Checking Account");

            if (balance < 0) {
                System.out.println("Transaction allowed using overdraft.");
            }

            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("\nWithdrawal exceeds overdraft limit.");
        }
    }
}
    

