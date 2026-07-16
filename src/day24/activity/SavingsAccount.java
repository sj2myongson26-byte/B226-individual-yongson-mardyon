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

    // Savings Account Class
public class SavingsAccount extends Account implements Transaction {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("\n~=~=~=Savings Account Info=~=~=~\n");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("\nDeposited " + amount + " into Savings Account");
        System.out.println("New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("\nWithdrew " + amount + " from Savings Account");
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("\nInsufficient Balance!");
        }
    }
}

    

