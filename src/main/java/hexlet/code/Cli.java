package hexlet.code;

import java.util.Scanner;


public class Cli {
    public static final Scanner SCANNER = new Scanner(System.in);
    private static String USER_NAME = "";

    public static String getUserName() {
        return USER_NAME;
    }

    public static void askName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        USER_NAME = SCANNER.nextLine();
        System.out.println("Hello, " + USER_NAME + "!");
    }
}
