package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");
            String input = Cli.scanner.nextLine();

            if ("0".equals(input)) {
                break;
            } else if ("1".equals(input)) {
                Cli.askName();
            } else if ("2".equals(input)) {
                Even.game();
            } else if ("3".equals(input)) {
                Calc.game();
            } else if ("4".equals(input)) {
                GCD.game();
            } else if ("5".equals(input)) {
                Progression.game();
            } else {
                System.out.println("Error.");
            }


        }
        System.out.println("Exit.");

    }
}
