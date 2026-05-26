package com.pet.simulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   DIGITAL PET SIMULATOR");
        System.out.println("=================================");

        // User input
        System.out.print("Enter Pet Name: ");
        String petName = sc.nextLine();

        System.out.print("Enter Pet Type (Dog/Cat/Dragon): ");
        String petType = sc.nextLine();

        // Object creation
        Pet myPet = new Pet(petName, petType);

        int choice;

        do {

            System.out.println("\n========= MENU =========");
            System.out.println("1. Feed Pet");
            System.out.println("2. Play With Pet");
            System.out.println("3. Make Pet Sleep");
            System.out.println("4. Show Pet Status");
            System.out.println("5. Exit");
            System.out.println("========================");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    myPet.feed();
                    break;

                case 2:
                    myPet.play();
                    break;

                case 3:
                    myPet.sleep();
                    break;

                case 4:
                    myPet.showStatus();
                    break;

                case 5:
                    System.out.println("\nThank you for playing!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 5);

        sc.close();
    }
}