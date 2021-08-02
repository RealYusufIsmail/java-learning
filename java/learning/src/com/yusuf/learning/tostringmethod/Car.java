package com.yusuf.learning.tostringmethod;

public class Car {

    String make = "Tesla";
    String model = "Y";
    String color = "White";
    int year = 2021;

    //overriding toString method
    public String toString() {
            //String myString = make +"\n"+model+"\n"+color+"\n"+year;
            return make +"\n"+model+"\n"+color+"\n"+year;
    }
}
