import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1);
        System.out.println("A random number has been generated...");
        Scanner scanner = new Scanner(System.in);

        // Guess 1
        processUserAnswer(scanner, computerNumber);

        // Guess 2
        processUserAnswer(scanner, computerNumber);

        // Guess 3
        processUserAnswer(scanner, computerNumber);

        System.out.println("Sorry for your luck, restart the program to play again!");
    }

    private static void processUserAnswer(Scanner scanner, int computerNumber) {
        System.out.println("Enter a guess between 1 and 100");
        int userAnswer = scanner.nextInt();
        if (userAnswer <=0 || userAnswer >100) {
            System.out.println("Invalid response");
        }
        else if (userAnswer == computerNumber ){
            System.out.println("Correct! You win! See you next time!");
            System.exit(0);
        }
        else if (userAnswer > computerNumber) {
            System.out.println("Your guess is too high, guess again.");
        }
        else {
            System.out.println("Your guess is too low.");
        }
    }
}