package hexlet.code;

public class Engine {
    private static String userName = "";
    private static String input = "";


    public static void printCongrats() {
        System.out.println("Congratulations, " + getUserName() + "!");
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
    }

    private static void stopGame() {
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

    public static boolean isAnswerCorrect(String answer) {
        input = Utils.SCANNER.nextLine();
        return answer.equals(input);
    }

    public static void runGame(String intro, int numbersOfGames, String[] questionAnswer) {
        if (getUserName().isEmpty()) {
            sayHello();
        }
        System.out.println(intro);

        for (int i = 0; i < numbersOfGames * 2; i += 2) {
            String question = questionAnswer[i];
            String answer = questionAnswer[i + 1];

            System.out.println("Question: " + question);
            if (isAnswerCorrect(answer)) {
                Engine.printCorrect();
            } else {
                Engine.printWrong(input, answer);
                stopGame();
            }
        }
        printCongrats();
    }
}
