package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class GCD {
    private final static int MIN_RANGE = 1;
    private final static int MAX_RANGE = 99;
    private final static int NUMBERS_OF_GAMES = 3;

    public static void game() {
        Engine.gameStart("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < NUMBERS_OF_GAMES; i++) {
            int a = Engine.random(MIN_RANGE, MAX_RANGE);
            int b = Engine.random(MIN_RANGE, MAX_RANGE);
            Engine.printQuestion(a + " " + b);
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            int answer = a;
            int input = Integer.parseInt(Cli.SCANNER.nextLine());
            if (answer == input) {
                Engine.printCorrect();
            } else {
                Engine.printWrong(input + "", answer + "");
            }
        }
        Engine.gameFinish();
    }
}
