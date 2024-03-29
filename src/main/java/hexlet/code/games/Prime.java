package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String INTRO = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void game() {
        String[] questionAnswer = new String[Engine.DEFAULT_NUMBERS_OF_GAMES * 2];
        for (int i = 0; i < Engine.DEFAULT_NUMBERS_OF_GAMES * 2; i += 2) {
            int number = Utils.random(Utils.DEFAULT_MIN_RANGE, Utils.DEFAULT_MAX_RANGE);

            questionAnswer[i] = number + "";
            questionAnswer[i + 1] = (isPrime(number)) ? "yes" : "no";
        }
        Engine.runGame(INTRO, questionAnswer);
    }

    public static boolean isPrime(final int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return (n > 1);
    }
}
