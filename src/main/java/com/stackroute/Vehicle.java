package com.stackroute;

public abstract class Vehicle {

        Vehicle() {
                System.out.println("This is our Vehicle");
        }
        void start() {
                System.out.println("Car starts");
        }
        void stop() {
                System.out.println("Car Stops");
        }
        abstract void handSteering();
        abstract void changeGears();
        abstract void speed();
}