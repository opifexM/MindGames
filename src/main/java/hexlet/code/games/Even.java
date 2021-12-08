package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 99;
    private static final int NUMBERS_OF_GAMES = 3;

    public static void game() {
        Engine.gameStart("Answer 'yes' if number even otherwise answer 'no'.");
        for (int i = 0; i < NUMBERS_OF_GAMES; i++) {
            int number = Engine.random(MIN_RANGE, MAX_RANGE);
            Engine.printQuestion(number + "");
            String input = Engine.SCANNER.nextLine();
            if (("yes".equals(input) && (number % 2 == 0)) || ("no".equals(input) && (number % 2 != 0))) {
                Engine.printCorrect();
            } else {
                Engine.printWrong(input, "");
            }
        }
        Engine.gameFinish();
    }
}
