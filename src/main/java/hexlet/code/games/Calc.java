package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Calc {
    private final static int MIN_RANGE = 1;
    private final static int MAX_RANGE = 99;

    public static void game() {
        Engine.gameStart("Answer 'yes' if number even otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int number1 = Engine.random(MIN_RANGE, MAX_RANGE);
            int number2 = Engine.random(MIN_RANGE, MAX_RANGE);
            String chars = "+-*";
            char action = chars.charAt(Engine.random(1, chars.length() - 1));

            Engine.printQuestion(number1 + " " + action + " " + number2);
            int input = Integer.parseInt(Cli.SCANNER.nextLine());
            int answer;
            if (action == '+') {
                answer = number1 + number2;
            } else if (action == '-') {
                answer = number1 - number2;
            } else {
                answer = number1 * number2;
            }
            if (answer == input) {
                Engine.printCorrect();
            } else {
                Engine.printWrong(input + "", answer + "");
            }
        }
        Engine.gameFinish();
    }
}
