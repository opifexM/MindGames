package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String INTRO = "Find the greatest common divisor of given numbers.";

    public static void game() {
        String[] questionAnswer = new String[Utils.DEFAULT_NUMBERS_OF_GAMES * 2];
        for (int i = 0; i < Utils.DEFAULT_NUMBERS_OF_GAMES * 2; i += 2) {
            int a = Utils.random(Utils.DEFAULT_MIN_RANGE, Utils.DEFAULT_MAX_RANGE);
            int b = Utils.random(Utils.DEFAULT_MIN_RANGE, Utils.DEFAULT_MAX_RANGE);

            questionAnswer[i] = a + " " + b;
            questionAnswer[i + 1] = String.valueOf(findGreatestDivisor(a, b));
        }
        Engine.runGame(INTRO, Utils.DEFAULT_NUMBERS_OF_GAMES, questionAnswer);
    }

    private static int findGreatestDivisor(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
