package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even {
    public static void game() {
        Engine.gameStart("Answer 'yes' if number even otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int number = Engine.random(1, 99);
            Engine.printQuestion(number + "");
            String input = Cli.scanner.nextLine();
            if (("yes".equals(input) && (number % 2 == 0)) || ("no".equals(input) && (number % 2 != 0))) {
                Engine.printCorrect();
            } else {
                Engine.printWrong(input, "");
            }
        }
        Engine.gameFinish();
    }
}
