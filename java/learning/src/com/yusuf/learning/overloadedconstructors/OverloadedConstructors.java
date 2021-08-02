package com.yusuf.learning.overloadedconstructors;

public class OverloadedConstructors {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("Thin crust", "Cornflour oil", "Mozzarella",
                "Tomato sauce", "Meat");

        Pizza cheese_pizza = new Pizza("Thin crust", "Cornflour oil", "Mozzarella",
                "Tomato sauce");

        Pizza plain_pizza = new Pizza("Thin crust");

        System.out.println("Here is the ingredient's of your pizza");
        System.out.println(pizza.bread);
        System.out.println(pizza.oil);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println(pizza.toppings);
    }
}
