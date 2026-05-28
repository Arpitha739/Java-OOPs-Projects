package com.payment.gateway;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     SMART PAYMENT GATEWAY");
        System.out.println("=================================");

        int choice;

        do {

            System.out.println("\n========= PAYMENT MENU =========");
            System.out.println("1. UPI Payment");
            System.out.println("2. Credit Card Payment");
            System.out.println("3. Crypto Payment");
            System.out.println("4. PayPal Payment");
            System.out.println("5. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if(choice == 5) {
                System.out.println("Exiting Payment Gateway...");
                break;
            }

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            Payment payment = null;

            switch(choice) {

                case 1:
                    payment = new UPIPayment(amount);
                    break;

                case 2:
                    payment = new CreditCardPayment(amount);
                    break;

                case 3:
                    payment = new CryptoPayment(amount);
                    break;

                case 4:
                    payment = new PayPalPayment(amount);
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

            // Dynamic Polymorphism
            if(payment != null) {
                payment.pay();
            }

        } while(choice != 5);

        sc.close();
    }
}