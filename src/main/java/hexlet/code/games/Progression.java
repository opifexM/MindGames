package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Progression {
    public static void game() {
        Engine.gameStart("What number is missing in the progression?");
        for (int i = 0; i < 3; i++) {
            int totalNumber = Engine.random(5, 10);
            int hideNumber = Engine.random(1, totalNumber - 1);
            int step = Engine.random(1, 10);
            int number = Engine.random(1, 20);
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
