package learning;

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

        shoppingList.add(bakeryList);
        shoppingList.add(drinks);

        System.out.println(shoppingList);
        //System.out.println(shoppingList.get(0));
        //gets bakeryList since a computer counts from 0. so 0 is bakeryList.

        //System.out.println(shoppingList.get(0).get(0);
        //gets the 1st item from the bakeryList since a computer counts from 0. so 0 is wheat.
    }
}
