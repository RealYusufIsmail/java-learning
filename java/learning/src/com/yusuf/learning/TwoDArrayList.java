package com.yusuf.learning;

import java.util.*;

public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> shoppingList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();

        bakeryList.add("wheat");
        bakeryList.add("bread");
        bakeryList.add("milk");
        bakeryList.add("egg");


        ArrayList<String> drinks = new ArrayList();

        bakeryList.add("water");
        bakeryList.add("seven up");
        bakeryList.add("coke");
        bakeryList.add("pepsi");

        System.out.println(bakeryList);
        System.out.println(drinks);


        shoppingList.add(bakeryList);

        System.out.println(shoppingList);
        //System.out.println(shoppingList.get(0));
        //gets Cereal since a computer counts from 0. so 0 is Cereal
    }
}
