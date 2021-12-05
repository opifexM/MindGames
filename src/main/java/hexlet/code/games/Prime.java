package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime {
    public static void game() {
        Engine.gameStart("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int number = Engine.random(1, 99);
            boolean answer = isPrime(number);
            Engine.printQuestion(number + "");
            String input = Cli.scanner.nextLine();
            if (("yes".equals(input) && answer) || ("no".equals(input) && !answer)) {
                Engine.printCorrect();
            } else {
                Engine.printWrong(input, answer + "");
            }
        }
    }

    public static boolean isPrime(final int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return (n > 1);
    }
}
