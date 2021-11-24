package com.yusuf.learning.method_overriding;

public class MethodOverriding {
    public static void main(String[] args) {
        // method overriding = 	Declaring a method in sub class,
        //						which is already present in parent class.
        //						done so that a child class can give its own implementation.

        Animals animals = new Animals();
        Cat cat = new Cat();

        cat.speak(); //will display The cat is puring since i am overriding it.
        animals.speak(); //will display The animals are speaking.
    }
}
