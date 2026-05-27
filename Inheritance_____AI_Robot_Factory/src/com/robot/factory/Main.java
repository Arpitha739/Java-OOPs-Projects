package com.robot.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      AI ROBOT FACTORY 🤖");
        System.out.println("=================================");

        System.out.print("Enter Cleaning Robot Name: ");
        CleaningRobot cRobot = new CleaningRobot(sc.nextLine());

        System.out.print("Enter Security Robot Name: ");
        SecurityRobot sRobot = new SecurityRobot(sc.nextLine());

        System.out.print("Enter Delivery Robot Name: ");
        DeliveryRobot dRobot = new DeliveryRobot(sc.nextLine());

        int choice;

        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Cleaning Robot Task");
            System.out.println("2. Security Robot Task");
            System.out.println("3. Delivery Robot Task");
            System.out.println("4. Show Status");
            System.out.println("5. Charge All Robots");
            System.out.println("6. Exit");
            System.out.println("========================");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    cRobot.performTask();
                    break;

                case 2:
                    sRobot.performTask();
                    break;

                case 3:
                    dRobot.performTask();
                    break;

                case 4:
                    cRobot.status();
                    sRobot.status();
                    dRobot.status();
                    break;

                case 5:
                    cRobot.charge();
                    sRobot.charge();
                    dRobot.charge();
                    break;

                case 6:
                    System.out.println("Exiting Factory...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}