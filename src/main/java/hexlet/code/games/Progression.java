package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 20;
    private static final int MIN_RANGE_FOR_STEP = 1;
    private static final int MAX_RANGE_FOR_STEP = 10;
    private static final int MIN_RANGE_FOR_TOTAL_NUMBER = 5;
    private static final int MAX_RANGE_FOR_TOTAL_NUMBER = 10;
    private static final String INTRO = "What number is missing in the progression?";


    public static void game() {
        String[] questionAnswer = new String[Utils.DEFAULT_NUMBERS_OF_GAMES * 2];
        for (int i = 0; i < Utils.DEFAULT_NUMBERS_OF_GAMES * 2; i += 2) {
            int totalNumber = Utils.random(MIN_RANGE_FOR_TOTAL_NUMBER, MAX_RANGE_FOR_TOTAL_NUMBER);
            int hideNumber = Utils.random(1, totalNumber - 1);
            int step = Utils.random(MIN_RANGE_FOR_STEP, MAX_RANGE_FOR_STEP);
            int number = Utils.random(MIN_RANGE, MAX_RANGE);
            int answer = 0;
            StringBuilder text = new StringBuilder();
            for (int j = 0; j <= totalNumber; j++) {
                if (j != hideNumber) {
                    text.append(number).append(" ");
                } else {
                    text.append(".. ");
                    answer = number;
                }
                number += step;
            }
            questionAnswer[i] = String.valueOf(text);
            questionAnswer[i + 1] = String.valueOf(answer);

        }
        Engine.runGame(INTRO, questionAnswer);

    }
}
