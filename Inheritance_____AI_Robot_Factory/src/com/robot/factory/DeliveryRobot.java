package com.robot.factory;

public class DeliveryRobot extends Robot {

    public DeliveryRobot(String name) {
        super(name);
    }

    public void deliverPackage() {
        batteryLevel -= 30;
        System.out.println(name + " is delivering a package 📦");
    }

    @Override
    public void performTask() {
        deliverPackage();
    }
}