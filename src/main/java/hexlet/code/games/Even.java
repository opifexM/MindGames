package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String INTRO = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void game() {
        String[] questionAnswer = new String[Utils.DEFAULT_NUMBERS_OF_GAMES * 2];
        for (int i = 0; i < Utils.DEFAULT_NUMBERS_OF_GAMES * 2; i += 2) {
            int number = Utils.random(Utils.DEFAULT_MIN_RANGE, Utils.DEFAULT_MAX_RANGE);

            questionAnswer[i] = number + "";
            questionAnswer[i + 1] = (number % 2 == 0) ? "yes" : "no";
        }

        Engine.runGame(INTRO, questionAnswer);
    }
}
