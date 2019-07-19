package com.stackroute;

public abstract class Car extends Vehicle {
    void handSteering() {
        System.out.println("Hand Steering is working good");
    }
    void running() {
        System.out.println("Car is running safely");
    }
    void changeGears() {
        System.out.println("Gears are working smoothly");
    }
}
