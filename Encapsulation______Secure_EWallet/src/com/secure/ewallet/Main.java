package com.secure.ewallet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      SECURE E-WALLET SYSTEM");
        System.out.println("=================================");

        // Create wallet object
        EWallet wallet = new EWallet("Arpitha", 1234, 5000);

        int choice;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change PIN");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.println("==========================");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter PIN: ");
                    int balancePin = sc.nextInt();

                    double balance = wallet.getBalance(balancePin);

                    if(balance != -1) {
                        System.out.println("Current Balance: Rs." + balance);
                    }

                    break;

                case 2:

                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();

                    wallet.deposit(depositAmount);

                    break;

                case 3:

                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();

                    System.out.print("Enter PIN: ");
                    int withdrawPin = sc.nextInt();

                    wallet.withdraw(withdrawAmount, withdrawPin);

                    break;

                case 4:

                    System.out.print("Enter old PIN: ");
                    int oldPin = sc.nextInt();

                    System.out.print("Enter new PIN: ");
                    int newPin = sc.nextInt();

                    wallet.changePin(oldPin, newPin);

                    break;

                case 5:

                    wallet.showTransactionHistory();

                    break;

                case 6:

                    System.out.println("\nThank you for using Secure E-Wallet!");
                    break;

                default:

                    System.out.println("Invalid choice!");
            }

        } while(choice != 6);

        sc.close();
    }
}
