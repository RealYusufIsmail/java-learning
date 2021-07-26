package com.yusuf.learning;

public class Arrays {
    public static void main(String[] args) {
        // arrays = used to store multiple values in single variable

        String[] cars = {"Tesla","Camaro"};
        //You can only add strings to the array. If you int you can only add integers.
        cars[1] = "Lamborghini";
        System.out.println(cars[1]);

        //another way to create an array
        String[] foods = new String[4];
        //4 means 0,1,2,3. not 1,2,3,4. Computers start at 0.

        foods[0] = "Pizza";
        foods[1] = "Steak";
        foods[2] = "Rice";
        foods[3] = "spaghetti";

       // System.out.println("My favourite food is " + foods[3]);

        for(int i = 0; i < foods.length; i++) {
            System.out.println(foods[i]);
        }
        //prints out all the foods.
        //Pizza
        //Steak
        //Rice
        //spaghetti
    }
}
