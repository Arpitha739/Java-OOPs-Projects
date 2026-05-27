package com.robot.factory;

public class SecurityRobot extends Robot {

    public SecurityRobot(String name) {
        super(name);
    }

    public void patrol() {
        batteryLevel -= 25;
        System.out.println(name + " is patrolling the area 🛡️");
    }

    public void detectIntruder() {
        batteryLevel -= 15;
        System.out.println(name + " detected an intruder 🚨");
    }

    @Override
    public void performTask() {
        patrol();
        detectIntruder();
    }
}