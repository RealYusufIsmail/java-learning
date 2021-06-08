package com.example.java;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = 42;

        int result1 = intValue1 + intValue2;
        System.out.println("Addition " + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("Sebtraction " + result2);

        int result3 =  intValue1 * intValue2;
        System.out.println("Multiplication " + result3);

        double result4 = (double) intValue1 / intValue2;
        System.out.println("Divvion " + result4);

        double doubleValue = -3.99999;
        long rounded = Math.round(doubleValue);
        System.out.println("Rounded " + rounded);

        double absValue = Math.abs(doubleValue);
        System.out.println("absValue " + absValue);

    }

}
