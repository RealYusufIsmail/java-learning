package com.yusuf.learning.abstraction;

public class Car extends Vehicle{

    @Override
    public void go() {
        System.out.println("The driver is driving the car");
    }

    @Override
    public void stop() {
        System.out.println("The driver is stopping the car");
    }
}
