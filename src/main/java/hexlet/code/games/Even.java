package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even {
    private final static int MIN_RANGE = 1;
    private final static int MAX_RANGE = 99;

    public static void game() {
        Engine.gameStart("Answer 'yes' if number even otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int number = Engine.random(MIN_RANGE, MAX_RANGE);
            Engine.printQuestion(number + "");
            String input = Cli.SCANNER.nextLine();
            if (("yes".equals(input) && (number % 2 == 0)) || ("no".equals(input) && (number % 2 != 0))) {
                Engine.printCorrect();
            } else {
                Engine.printWrong(input, "");
            }
        }
        Engine.gameFinish();
    }
}
