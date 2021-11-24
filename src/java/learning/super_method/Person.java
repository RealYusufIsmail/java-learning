package com.yusuf.learning.super_method;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + "\n" + "\n" + this.age + "\n";
    }
}
