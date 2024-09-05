import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;

        int guess = 0;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100!");

        // Loop until the user guesses the correct number
        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();  // Read the user's guess
            attempts++;  // Increment the number of attempts

            // Provide feedback on the user's guess
            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You've guessed the right number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
