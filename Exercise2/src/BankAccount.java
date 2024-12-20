/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// BankAccount.java
abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Abstract method for withdrawal
    public abstract void withdraw(double amount);

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Method for transferring funds between accounts
    public void transfer(BankAccount destinationAccount, double amount) {
        if (amount <= this.balance) {
            this.withdraw(amount);
            destinationAccount.deposit(amount);
            System.out.println("Transferred " + amount + " to account " + destinationAccount.accountNumber);
        } else {
            System.out.println("Insufficient funds to transfer.");
        }
    }
}

