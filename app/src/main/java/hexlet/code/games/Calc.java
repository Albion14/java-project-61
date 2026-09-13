package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {

    public static void play() {
        Random random = new Random();
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = random.nextInt(100);
            int secondNumber = random.nextInt(100);
            int operation = random.nextInt(3);

            String operator;
            int result;

            switch (operation) {
                case 0 -> {
                    operator = "+";
                    result = firstNumber + secondNumber;
                }
                case 1 -> {
                    operator = "-";
                    result = firstNumber - secondNumber;
                }
                default -> {
                    operator = "*";
                    result = firstNumber * secondNumber;
                }
            }

            rounds[i][0] = firstNumber + " " + operator + " " + secondNumber;
            rounds[i][1] = String.valueOf(result);
        }

        Engine.run("What is the result of the expression?", rounds);
    }
}
