package hexlet.code;

public class Engine {
    public static void gameStart(String intro) {
        if (Cli.USER_NAME.isEmpty()) {
            Cli.askName();
        }
        System.out.println(intro);
    }

    public static void gameFinish() {
        System.out.println("Congratulations, " + Cli.USER_NAME + "!");
    }

    public static int random(int min, int max) {
        return (int) (Math.random() * max) + min;
    }

    public static void printQuestion(String text) {
        System.out.println("Question: " + text);
    }

    public static void printCorrect() {
        System.out.println("Correct!");
    }

    public static void printWrong(String input, String answer) {
        System.out.print("'" + input + "' is wrong answer ;(.");
        if (!answer.isEmpty()) {
            System.out.println(" Correct answer was '" + answer + "'.");
        } else {
            System.out.println();
        }
        System.out.println("Let's try again, " + Cli.USER_NAME + "!");
    }

}
