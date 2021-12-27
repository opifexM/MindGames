package hexlet.code;

public class Engine {
    public static final int DEFAULT_NUMBERS_OF_GAMES = 3;

    public static void runGame(String intro, String[] questionAnswer) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = Utils.SCANNER.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(intro);
        boolean isWin = true;
        for (int i = 0; i < DEFAULT_NUMBERS_OF_GAMES * 2; i += 2) {
            String question = questionAnswer[i];
            String answer = questionAnswer[i + 1];

            System.out.println("Question: " + question);
            String userAnswer = Utils.SCANNER.nextLine();

            if (!userAnswer.equals(answer)) {
                System.out.print("'" + userAnswer + "' is wrong answer ;(.");
                System.out.println(" Correct answer was '" + answer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                isWin = false;
                break;
            }
            System.out.println("Correct!");

        }
        if (isWin) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
