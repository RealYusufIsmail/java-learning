package com.yusuf.learning.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        // inheritance = 	the process where one class acquires,
        //					the attributes and methods of another.

        Car car = new Car();

        //car.go();

        Bicycle bicycle = new Bicycle();

        //bicycle.stop();

        System.out.println(car.doors);
        System.out.println(bicycle.pedals);
    }
}
