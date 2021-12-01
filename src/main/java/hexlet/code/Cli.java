package hexlet.code;

import java.util.Scanner;

public class Cli {
    static Scanner scanner = new Scanner(System.in);
    public static void askName() {
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }



}
