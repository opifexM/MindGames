package hexlet.code;

public class Engine {
    private static String userName = "";


    public static void gameStart(String intro) {
        if (getUserName().isEmpty()) {
            sayHello();
        }
        System.out.println(intro);
    }


    public static void gameFinish() {
        System.out.println("Congratulations, " + getUserName() + "!");
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
        System.out.println("Let's try again, " + getUserName() + "!");
        System.exit(0);
    }

    public static void sayHello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = Utils.SCANNER.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static String getUserName() {
        return userName;
    }


    public static void checkAnswer(String answer) {
        String input = Utils.SCANNER.nextLine();
        if (answer.equals(input)) {
            Engine.printCorrect();
        } else {
            Engine.printWrong(input, answer);
        }
    }
}
