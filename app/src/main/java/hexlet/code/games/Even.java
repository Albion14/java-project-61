package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {

    public static void play() {
        Random random = new Random();
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = random.nextInt(100) + 1;

            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = number % 2 == 0 ? "yes" : "no";
        }

        Engine.run("Answer 'yes' if the number is even, otherwise answer 'no'.", rounds);
    }
}
