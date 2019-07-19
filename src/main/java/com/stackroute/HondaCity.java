package com.stackroute;

public class HondaCity extends Car {
    void speed() {
        System.out.println("We are able to increase or decrease speed of HondaCity Car");
    }

    public static void main (String[] args) {
        HondaCity hondaCity = new HondaCity();
        hondaCity.start();
        hondaCity.handSteering();
        hondaCity.changeGears();
        hondaCity.running();
        hondaCity.speed();
        hondaCity.stop();
    }
}
