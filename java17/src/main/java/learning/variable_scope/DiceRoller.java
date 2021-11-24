package learning.variable_scope;

import java.util.Random;

public class DiceRoller {
    Random random;
    int number; // this is global.

    DiceRoller() {
        random = new Random();
        roll();
    }

    public void roll() {
            number = random.nextInt(6)+1;
            System.out.println(number);
    }
}
