package hexlet.code;

import java.util.Scanner;


public class Cli {
    public static final Scanner SCANNER = new Scanner(System.in);
    private static String userName = "";

    public static String getUserName() {
        return userName;
    }

    public static void askName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = SCANNER.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
