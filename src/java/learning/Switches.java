package com.yusuf.learning;

public class Switches {
    public static void main(String[] args) {

        // switch = statement that allows a variable to be tested for equality against a list of values.

        String day = "Sunday";

        //use this if you are using a lot of if statements.
        switch (day) {
            case "Sunday":
                System.out.println("It is sunday");
                break; // Will only run the needed code not the other code
            case "Monday":
                System.out.println("It is Monday");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturday":
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("That's not a day!");
        }
    }
}
