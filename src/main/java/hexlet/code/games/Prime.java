package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 99;
    private static final int NUMBERS_OF_GAMES = 3;

    public static void game() {
        Engine.gameStart("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < NUMBERS_OF_GAMES; i++) {
            int number = Utils.random(MIN_RANGE, MAX_RANGE);
            String answer;
            if (isPrime(number)) {
                answer = "yes";
            } else {
                answer = "no";
            }
            Engine.printQuestion(number + "");
            Engine.checkAnswer(answer);
        }
        Engine.gameFinish();
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
