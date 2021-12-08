package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 99;
    private static final int NUMBERS_OF_GAMES = 3;

    public static void game() {
        Engine.gameStart("Answer 'yes' if number even otherwise answer 'no'.");
        for (int i = 0; i < NUMBERS_OF_GAMES; i++) {
            int number1 = Utils.random(MIN_RANGE, MAX_RANGE);
            int number2 = Utils.random(MIN_RANGE, MAX_RANGE);
            String chars = "+-*";
            char action = chars.charAt(Utils.random(1, chars.length() - 1));
            int answer;
            if (action == '+') {
                answer = number1 + number2;
            } else if (action == '-') {
                answer = number1 - number2;
            } else {
                answer = number1 * number2;
            }
            Engine.printQuestion(number1 + " " + action + " " + number2);
            Engine.checkAnswer(answer + "");
        }
        Engine.gameFinish();
    }
}
