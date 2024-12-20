/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// FixedDepositAccount.java
class FixedDepositAccount extends BankAccount {
    private int termMonths; // term in months
    private int monthsPassed;

    public FixedDepositAccount(String accountNumber, double balance, int termMonths) {
        super(accountNumber, balance);
        this.termMonths = termMonths;
        this.monthsPassed = 0;
    }

    // Increment months passed for the FD (to simulate time passing)
    public void passMonths(int months) {
        monthsPassed += months;
        if (monthsPassed >= termMonths) {
            System.out.println("Fixed deposit term completed.");
        } else {
            System.out.println("Term not completed yet. " + (termMonths - monthsPassed) + " months remaining.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (monthsPassed >= termMonths) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
            } else {
                System.out.println("Insufficient balance in Fixed Deposit Account.");
            }
        } else {
            System.out.println("Cannot withdraw before the fixed deposit term ends.");
        }
    }
}

