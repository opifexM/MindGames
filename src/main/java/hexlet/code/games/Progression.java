package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Progression {
    private final static int MIN_RANGE = 1;
    private final static int MAX_RANGE = 20;
    private final static int NUMBERS_OF_GAMES = 3;
    private final static int MIN_RANGE_FOR_STEP = 1;
    private final static int MAX_RANGE_FOR_STEP = 10;
    private final static int MIN_RANGE_FOR_TOTAL_NUMBER = 5;
    private final static int MAX_RANGE_FOR_TOTAL_NUMBER = 10;

    public static void game() {
        Engine.gameStart("What number is missing in the progression?");
        for (int i = 0; i < NUMBERS_OF_GAMES; i++) {
            int totalNumber = Engine.random(MIN_RANGE_FOR_TOTAL_NUMBER, MAX_RANGE_FOR_TOTAL_NUMBER);
            int hideNumber = Engine.random(1, totalNumber - 1);
            int step = Engine.random(MIN_RANGE_FOR_STEP, MAX_RANGE_FOR_STEP);
            int number = Engine.random(MIN_RANGE, MAX_RANGE);
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
