package com.pet.simulator;

public class Pet {

    // Attributes
    String name;
    String type;
    int hunger;
    int energy;
    int happiness;

    // Constructor
    public Pet(String name, String type) {
        this.name = name;
        this.type = type;

        hunger = 50;
        energy = 50;
        happiness = 50;
    }

    // Feed method
    public void feed() {
        hunger -= 10;
        happiness += 5;

        if (hunger < 0) {
            hunger = 0;
        }

        if (happiness > 100) {
            happiness = 100;
        }

        System.out.println(name + " enjoyed the food!");
    }

    // Play method
    public void play() {
        energy -= 10;
        happiness += 10;
        hunger += 5;

        if (energy < 0) {
            energy = 0;
        }

        if (happiness > 100) {
            happiness = 100;
        }

        System.out.println(name + " had fun playing!");
    }

    // Sleep method
    public void sleep() {
        energy += 20;

        if (energy > 100) {
            energy = 100;
        }

        System.out.println(name + " slept peacefully!");
    }

    // Display status
    public void showStatus() {

        System.out.println("\n========== PET STATUS ==========");
        System.out.println("Pet Name   : " + name);
        System.out.println("Pet Type   : " + type);
        System.out.println("Hunger     : " + hunger);
        System.out.println("Energy     : " + energy);
        System.out.println("Happiness  : " + happiness);
        System.out.println("================================");
    }
}
