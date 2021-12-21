package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String INTRO = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final String[] OPERATIONS = new String[]{"+", "-", "*"};

    public static void game() {
        String[] questionAnswer = new String[Utils.DEFAULT_NUMBERS_OF_GAMES * 2];

        for (int i = 0; i < Utils.DEFAULT_NUMBERS_OF_GAMES * 2; i += 2) {
            int number1 = Utils.random(Utils.DEFAULT_MIN_RANGE, Utils.DEFAULT_MAX_RANGE);
            int number2 = Utils.random(Utils.DEFAULT_MIN_RANGE, Utils.DEFAULT_MAX_RANGE);
            String action = OPERATIONS[Utils.random(0, OPERATIONS.length - 1)];

            questionAnswer[i] = number1 + " " + action + " " + number2;
            questionAnswer[i + 1] = String.valueOf(getAnswer(number1, number2, action));
        }

        Engine.runGame(INTRO, questionAnswer);
    }

    private static int getAnswer(int number1, int number2, String action) {
        return switch (action) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            default -> -1;
        };
    }
}
