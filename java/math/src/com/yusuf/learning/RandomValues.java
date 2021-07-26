package com.yusuf.learning;

import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {

        Random random = new Random();

        //int x = random.nextInt(6);
        //will generate numbers from 0 to 6. computer start from 0
        //to generate up to 6 do
        //int x = random.nextInt(6)+1;

        //double y = random.nextDouble();
        //generates a number from 0 to 1. for example 0.7824646005472964

        boolean w = random.nextBoolean();
        //will gives us false or true

        System.out.println(w);

    }
}
