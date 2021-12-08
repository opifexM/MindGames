package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 99;
    private static final int NUMBERS_OF_GAMES = 3;

    public static void game() {
        Engine.gameStart("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < NUMBERS_OF_GAMES; i++) {
            int a = Utils.random(MIN_RANGE, MAX_RANGE);
            int b = Utils.random(MIN_RANGE, MAX_RANGE);
            Engine.printQuestion(a + " " + b);
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            int answer = a;
            Engine.checkAnswer(answer + "");
        }
        Engine.gameFinish();
    }
}
