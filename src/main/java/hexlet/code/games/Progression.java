package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 20;
    private static final int NUMBERS_OF_GAMES = 3;
    private static final int MIN_RANGE_FOR_STEP = 1;
    private static final int MAX_RANGE_FOR_STEP = 10;
    private static final int MIN_RANGE_FOR_TOTAL_NUMBER = 5;
    private static final int MAX_RANGE_FOR_TOTAL_NUMBER = 10;

    public static void game() {
        Engine.gameStart("What number is missing in the progression?");
        for (int i = 0; i < NUMBERS_OF_GAMES; i++) {
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
            Engine.printQuestion(text.toString());
            Engine.checkAnswer(answer + "");
        }
        Engine.gameFinish();
    }
}
