package hexlet.code;

import java.util.Scanner;

public class Utils {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static int random(int min, int max) {
        return (int) (Math.random() * max) + min;
    }
}
