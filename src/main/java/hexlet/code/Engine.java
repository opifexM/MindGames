package hexlet.code;

public class Engine {
    public static void runGame(String intro, String[] questionAnswer) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = Utils.SCANNER.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(intro);
        boolean isWin = true;
        for (int i = 0; i < Utils.DEFAULT_NUMBERS_OF_GAMES * 2; i += 2) {
            String question = questionAnswer[i];
            String answer = questionAnswer[i + 1];

            System.out.println("Question: " + question);
            String input = Utils.SCANNER.nextLine();

            if (input.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + input + "' is wrong answer ;(.");
                System.out.println(" Correct answer was '" + answer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                isWin = false;
            }
        }
        if (isWin) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
