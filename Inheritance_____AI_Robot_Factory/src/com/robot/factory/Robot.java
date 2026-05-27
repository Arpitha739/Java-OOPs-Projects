package com.robot.factory;

public class Robot {

    protected String name;
    protected int batteryLevel;

    public Robot(String name) {
        this.name = name;
        this.batteryLevel = 100;
    }

    public void charge() {
        batteryLevel = 100;
        System.out.println(name + " is fully charged 🔋");
    }

    public void status() {
        System.out.println("\n--- Robot Status ---");
        System.out.println("Name: " + name);
        System.out.println("Battery: " + batteryLevel + "%");
    }

    public void performTask() {
        System.out.println(name + " is performing a generic task...");
    }
}