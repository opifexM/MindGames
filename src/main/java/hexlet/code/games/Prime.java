package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime {
    public static void game() {
        Engine.gameStart("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int number = Engine.random(1, 99);
            boolean answer;
            for (int j = 2; j < number; j++) {
                if (number % j == 0)
                    answer = false;
            }
            answer = (number > 1);
            Engine.printQuestion(number + "");
            String input = Cli.scanner.nextLine();
            if (("yes".equals(input) && answer) || ("no".equals(input) && !answer)) {
                Engine.printCorrect();
            } else {
                Engine.printWrong(input, answer + "");
            }
        }
    }
}
