package com.example.java;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The second value is " + intValue2);
        
        long longValue = intValue1;
        System.out.println("test " + longValue);


        short shortValue1 = (short) intValue1;
        System.out.println("The short value is " + shortValue1);
        
        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("The byte value is " + byteValue);


        double doubleValue = 3.9999999d;
        int intValue4 = (int) doubleValue;
        System.out.println("The int value is " + intValue4);
    }

}
