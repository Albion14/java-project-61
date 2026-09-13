package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {

    public static void play() {
        Random random = new Random();
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = random.nextInt(100) + 1;

            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = isPrime(number) ? "yes" : "no";
        }

        Engine.run("Answer 'yes' if given number is prime. Otherwise answer 'no'.", rounds);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
