package com.yusuf.learning;

import java.util.*;

public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();

        bakeryList.add("wheat");
        bakeryList.add("bread");
        bakeryList.add("milk");
        bakeryList.add("egg");

        System.out.println(bakeryList);

        ArrayList<String> shoppingList = new ArrayList();

        shoppingList.add("Cereal");
        shoppingList.add("bread");
        shoppingList.add("milk");
        shoppingList.add("egg");
        shoppingList.add("cake");
        shoppingList.add("chicken");
        shoppingList.add("meat");
        shoppingList.add("vegetables");
        shoppingList.add("fruits");
        shoppingList.add("coffee beans");

        System.out.println(shoppingList);
        //System.out.println(shoppingList.get(0));
        //gets Cereal since a computer counts from 0. so 0 is Cereal
    }
}
