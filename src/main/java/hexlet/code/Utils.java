package hexlet.code;

import java.util.Scanner;

public class Utils {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int DEFAULT_MIN_RANGE = 1;
    public static final int DEFAULT_MAX_RANGE = 99;
    public static final int DEFAULT_NUMBERS_OF_GAMES = 3;

    public static int random(int min, int max) {
        return (int) (Math.random() * max) + min;
    }
}
