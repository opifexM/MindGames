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
            String action = OPERATIONS[Utils.random(1, OPERATIONS.length - 1)];

            questionAnswer[i] = number1 + " " + action + " " + number2;
            questionAnswer[i + 1] = String.valueOf(getAnswer(number1, number2, action));
        }

        Engine.runGame(INTRO, Utils.DEFAULT_NUMBERS_OF_GAMES, questionAnswer);
    }

    private static int getAnswer(int number1, int number2, String action) {
        int calculation = 0;
        switch (action) {
            case "+" -> calculation = number1 + number2;
            case "-" -> calculation = number1 - number2;
            case "*" -> calculation = number1 * number2;
            default -> System.out.println("Calc - Error");
        }
        return calculation;
    }
}
