package com.yusuf.learning;

public class MathClass {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        //double z = Math.max(x, y);
        //finds the largest of x and y. The answer is x because a positive is always bigger than a negative.
        //double z = Math.min(x, y);
        //finds the smallest of x and y. The answer is x because a negative is always smaller than a positive.
        //double z = Math.abs(y);
        //finds the absolute value of a number. The answer for y will be 10.
        //double z = Math.sqrt(x);
        //square roots the value.
        //double z = Math.round(x);
        //rounds the value. The answer is be 3.0.
        //double z = Math.ceil(x);
        //ceil will round up the value. The answer is 4.0
        double z = Math.floor(x);
        //floor will round down the value. The answer is 3.0.
        System.out.println(z);
    }
}
