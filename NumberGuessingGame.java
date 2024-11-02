import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int rounds = 0;
        final int MAX_ATTEMPTS = 7; // Set maximum number of attempts

        while (true) {
            rounds++;
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
            int attemptsUsed = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nA new number has been generated! You have " + MAX_ATTEMPTS + " attempts to guess it.");

            while (attemptsUsed < MAX_ATTEMPTS) {
                System.out.print("Enter your guess (1-100): ");
                int guess = scanner.nextInt();
                attemptsUsed++;

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + attemptsUsed + " attempts.");
                    guessedCorrectly = true;
                    break; // Exit the guessing loop
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry! You've used all your attempts. The number was " + numberToGuess + ".");
            }

            // Calculate score based on attempts left
            totalScore += (guessedCorrectly ? (MAX_ATTEMPTS - attemptsUsed) : 0);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().trim().toLowerCase();
            if (!playAgain.equals("yes")) {
                break; // Exit the main loop
            }
        }

        System.out.println("\nYour total score after " + rounds + " rounds is: " + totalScore);
        scanner.close();
    }
}