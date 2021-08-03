package com.yusuf.learning.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        // exception = 	an event that occurs during the execution of a program that,
        //				disrupts the normal flow of instructions

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a second whole number to divide: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Here is your answer");
            System.out.println(z);
        }
        catch(ArithmeticException e) {
            System.out.println("you can not divide by 0! Stupid!");
        }
        catch (InputMismatchException i) {
            System.out.println("Please enter a number not a word. Are you stupid!");
        }
        catch (Exception e) {
            System.out.println("Error 404. Something has gone wrong");
        }
        finally {
            scanner.close();
        }
    }
}
