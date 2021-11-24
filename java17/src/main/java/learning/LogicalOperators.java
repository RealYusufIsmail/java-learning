package learning;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // logical operators = used to connect two or more expressions
        //
        //						&& = (AND) both conditions must be true
        // 						|| = (OR) either condition must be true
        //						! = (NOT) reverses boolean value of condition

        //&&(AND) Operator
        int temp = -1;

        if(temp > 35) {
            System.out.println("Wow that's is hot");
        }
        else if(temp >= 20 && temp<= 30) {
            System.out.println("It is warm outside");
        } else {
            System.out.println("Its cold.");
        }

        //||(OR) Operator
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! To quite the game press q  or Q.");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")) {
            System.out.println("You have quite the game");
        } else {
            System.out.println("You are still playing the game");
        }

        //!(NOT) Operator
        System.out.println("Do you want some water");
        String water = scanner.next();

        if(!water.equals("y") && !water.equals("yes")) {
            System.out.println("Ok you can have some water later");
        } else {
            System.out.println("Here is some water");
        }
        //! means that if something apart y and yes is given it means they do not want water.
        // if not yes and y then they do not want water
        // else(yes or y has been inputted) they want water.
    }
}
