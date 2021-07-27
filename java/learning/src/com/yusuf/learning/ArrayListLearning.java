package com.yusuf.learning;

import java.util.ArrayList;

public class ArrayListLearning {
    public static void main(String[] args) {
        // ArrayListLearning = 	a resizable array.
        //				Elements can be added and removed after compilation phase
        //				store reference data types

        ArrayList<String> deserts = new ArrayList<String>();

        deserts.add("chocolate cake");
        deserts.add("Vanilla cake");
        deserts.add("cookie cake");

        for(int i = 0; i < deserts.size(); i++) {
            System.out.println(deserts.get(i));
        }
    }
}
