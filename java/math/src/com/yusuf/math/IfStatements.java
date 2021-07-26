package com.yusuf.math;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        // if statement = performs a block of code if it's condition evaluates to be true

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age");
        int age = scanner.nextInt();

        //int age = 21;

        if(age < 18) {
            System.out.println("You can not legally get a job yet");
        } else if(age > 18) {
            System.out.println("You can get a job");
        } else {
            System.out.println("404 error.");
        }
        //don't need to use the equal sign since you can get a job at 18
        // i mean this <=

    }
}
