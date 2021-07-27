package com.yusuf.learning;

public class TwoDArrays {
    public static void main(String[] args) {
        // 2D array = an array of arrays
        String[][] foods = new String[3][3];
        //other way to wright it
        /*
        String[][] foods = {
                                {"Pizza","spaghetti","Rice"},
                                {"Steak","cooked lamb","cooked Chicken"},
                                {"Pancakes","egg","beans"}
                           };

         */

        foods[0][0] = "Pizza";
        foods[0][1] = "spaghetti";
        foods[0][2] = "Rice";
        foods[1][0] = "Steak";
        foods[1][1] = "cooked lamb";
        foods[1][2] = "cooked Chicken";
        foods[2][0] = "Pancakes";
        foods[2][1] = "egg";
        foods[2][2] = "beans";

        for(int i = 0; i < foods.length; i++) {
            System.out.println();
            for(int j = 0; j < foods[i].length; j++) {
                System.out.println(foods[i][j]+" ");
            }
        }
        //use j because it comes after it. int short for index here.
    }
}
