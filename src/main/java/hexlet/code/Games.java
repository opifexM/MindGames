package hexlet.code;

import java.util.Scanner;

public class Games {
    public static void isNameSelect() {
        if (Cli.name.isEmpty())
            Cli.askName();
    }

    public static void startEven() {
        isNameSelect();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int number = (int) (Math.random() * 99) + 1;
            System.out.println("Question: " + number);
            String input = Cli.scanner.nextLine();
            if (("yes".equals(input) && (number % 2 == 0)) || ("no".equals(input) && (number % 2 != 0))) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
}
