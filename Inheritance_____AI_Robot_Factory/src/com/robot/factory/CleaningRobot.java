package com.robot.factory;

public class CleaningRobot extends Robot {

    public CleaningRobot(String name) {
        super(name);
    }

    public void cleanFloor() {
        batteryLevel -= 20;
        System.out.println(name + " is cleaning the floor 🧹");
    }

    @Override
    public void performTask() {
        cleanFloor();
    }
}