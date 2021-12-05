package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class GCD {
    public static void game() {
        Engine.gameStart("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            int a = Engine.random(1, 99);
            int b = Engine.random(1, 99);
            Engine.printQuestion(a + " " + b);
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            int answer = a;
            int input = Integer.parseInt(Cli.scanner.nextLine());
            if (answer == input) {
                Engine.printCorrect();
            } else {
                Engine.printWrong(input + "", answer + "");
            }
        }
        Engine.gameFinish();
    }
}
