package com.secure.ewallet;

import java.util.ArrayList;

public class EWallet {

    // Private variables (Encapsulation)
    private String userName;
    private int pin;
    private double balance;

    // Transaction history
    private ArrayList<String> transactionHistory;

    // Constructor
    public EWallet(String userName, int pin, double balance) {
        this.userName = userName;
        this.pin = pin;
        this.balance = balance;

        transactionHistory = new ArrayList<>();
        transactionHistory.add("Wallet Account Created");
    }

    // Getter method
    public String getUserName() {
        return userName;
    }

    // Secure balance access
    public double getBalance(int enteredPin) {

        if (enteredPin == pin) {
            return balance;
        } else {
            System.out.println("Incorrect PIN!");
            return -1;
        }
    }

    // Deposit money
    public void deposit(double amount) {

        if (amount > 0) {

            balance += amount;

            transactionHistory.add("Deposited Rs." + amount);

            System.out.println("Rs." + amount + " deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw money
    public void withdraw(double amount, int enteredPin) {

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
            return;
        }

        balance -= amount;

        transactionHistory.add("Withdrawn Rs." + amount);

        System.out.println("Rs." + amount + " withdrawn successfully!");
    }

    // Change PIN
    public void changePin(int oldPin, int newPin) {

        if (oldPin == pin) {

            pin = newPin;

            transactionHistory.add("PIN Changed");

            System.out.println("PIN changed successfully!");
        } else {
            System.out.println("Incorrect Old PIN!");
        }
    }

    // Show transaction history
    public void showTransactionHistory() {

        System.out.println("\n====== TRANSACTION HISTORY ======");

        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }

        System.out.println("=================================");
    }
}
