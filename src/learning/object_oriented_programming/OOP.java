package com.yusuf.learning.object_oriented_programming;

public class OOP {
    public static void main(String[] args) {
        //oop = object oriented programming

        Car myFirstCar = new Car();
        Car mySecondCar = new Car();

        System.out.println(myFirstCar.year);
        System.out.println(myFirstCar.model);
        System.out.println(myFirstCar.price);
        System.out.println();
        System.out.println(mySecondCar.year);
        System.out.println(mySecondCar.model);
        System.out.println(mySecondCar.price);

        //myFirstCar.drive();
        //myFirstCar.brake();
    }
}
