package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 99;
    private static final int NUMBERS_OF_GAMES = 3;

    public static void game() {
        Engine.gameStart("Answer 'yes' if number even otherwise answer 'no'.");
        for (int i = 0; i < NUMBERS_OF_GAMES; i++) {
            int number = Utils.random(MIN_RANGE, MAX_RANGE);
            String answer;
            if (number % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }
            Engine.printQuestion(number + "");
            Engine.checkAnswer(answer);
        }
        Engine.gameFinish();
    }
}
