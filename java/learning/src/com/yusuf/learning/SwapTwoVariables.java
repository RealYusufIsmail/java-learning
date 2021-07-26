package com.yusuf.learning;

public class SwapTwoVariables {
    public static void main(String[] args) {
        String x = "Water";
        String y = "Apple Juice";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " +x);
        System.out.println("y: " +y);
    }
}
