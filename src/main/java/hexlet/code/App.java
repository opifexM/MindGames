package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");
            String input = Cli.scanner.nextLine();

            if ("0".equals(input)) {
                break;
            }
            else if ("1".equals(input)) {
                Cli.askName();
            }
            else if ("2".equals(input)) {
                Games.startEven();
            }
            else {
                System.out.println("Error.");
            }


        }
        System.out.println("Exit.");

    }
}
