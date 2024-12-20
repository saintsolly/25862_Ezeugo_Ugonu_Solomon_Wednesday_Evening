/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating different types of bank accounts
        BankAccount savings = new SavingsAccount("SA001", 5000, 5);
        BankAccount checking = new CheckingAccount("CA001", 2000, 500);
        BankAccount fixedDeposit = new FixedDepositAccount("FDA001", 10000, 12);

        // Demonstrating polymorphism and different withdraw behaviors
        savings.deposit(500);
        savings.withdraw(1000);
        ((SavingsAccount) savings).applyInterest();

        checking.deposit(1000);
        checking.withdraw(2500);
        checking.withdraw(2700);  // Exceeds overdraft limit

        fixedDeposit.deposit(2000);
        fixedDeposit.withdraw(3000);  // Cannot withdraw before term ends
        ((FixedDepositAccount) fixedDeposit).passMonths(13);  // Pass 13 months
        fixedDeposit.withdraw(3000);  // Now withdrawal is possible

        // Transferring funds between accounts
        savings.transfer(checking, 2000);
        checking.transfer(savings, 500);
    }
}

