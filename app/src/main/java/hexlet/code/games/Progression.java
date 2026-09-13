package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {

    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;

    public static void play() {
        Random random = new Random();
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int start = random.nextInt(20) + 1;
            int step = random.nextInt(10) + 1;
            int hiddenIndex = random.nextInt(length);

            StringBuilder question = new StringBuilder();

            for (int j = 0; j < length; j++) {
                int currentElement = start + j * step;

                if (j == hiddenIndex) {
                    question.append("..");
                } else {
                    question.append(currentElement);
                }

                if (j < length - 1) {
                    question.append(" ");
                }
            }

            int correctAnswer = start + hiddenIndex * step;

            rounds[i][0] = question.toString();
            rounds[i][1] = String.valueOf(correctAnswer);
        }

        Engine.run("What number is missing in the progression?", rounds);
    }
}
