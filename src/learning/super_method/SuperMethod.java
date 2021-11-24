package com.yusuf.learning.super_method;

public class SuperMethod {
    public static void main(String[] args) {
        // super = 	keyword refers to the superclass (parent) of an object
        //			very similar to the "this" keyword

        Hero hero1 = new Hero("Batman", 42, "Money");
        Hero hero2 = new Hero("Superman", 40, "Everything");

        System.out.println(hero2.toString());
    }
}
