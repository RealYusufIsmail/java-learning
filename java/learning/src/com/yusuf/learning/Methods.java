package com.yusuf.learning;

public class Methods {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon

        String name = "Yusuf";
        int age = 14;
        hello(name, age);
        age(age);
    }

    //add static when you want to call the method
    //Private means you cant import the method in other classes. Same applies to protected
    private static void hello(String name, int age) {
        System.out.println("Hello " + name);
    }

    //Public method means you can import it in other classes.
    public static void age(int age) {
        System.out.println("Yusuf is " + age);
    }
}
