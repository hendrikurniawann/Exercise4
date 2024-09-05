import java.util.Scanner;

public class Main {

    // MultiplicationTable
    class MultiplicationTable {
        public void printMultiplicationTable(int n) {
            System.out.println("Multiplication Table up to " + n + "x" + n + ":");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%4d", i * j);
                }
                System.out.println();
            }
        }
    }

    // Pattern
    class Pattern {
        public void printPattern(int n) {
            System.out.println("Pattern with " + n + " rows:");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    // ContinueNumber
    class ContinueNumber {
        public void continueOrStop() {
            Scanner scanner = new Scanner(System.in);
            int number;
            String choice;

            do {
                System.out.print("Enter a number: ");
                number = scanner.nextInt();
                System.out.print("Do you want to continue (y/n)? ");
                choice = scanner.next();
            } while (choice.equalsIgnoreCase("y"));

            System.out.println("Final number: " + number);
        }
    }

    // Game
    class Game {
        public void startGame() {
            Scanner scanner = new Scanner(System.in);
            int randomNumber = (int) (Math.random() * 100) + 1;
            int guess, attempts = 0;

            System.out.println("Guess the number between 1 and 100!");

            do {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < randomNumber) {
                    System.out.println("Too low!");
                } else if (guess > randomNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                }
            } while (guess != randomNumber);
        }
    }

    // SwapCase
    class SwapCase {
        public void swapCase(String input) {
            StringBuilder swapped = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (Character.isLowerCase(ch)) {
                    swapped.append(Character.toUpperCase(ch));
                } else if (Character.isUpperCase(ch)) {
                    swapped.append(Character.toLowerCase(ch));
                } else {
                    swapped.append(ch);
                }
            }
            System.out.println("Swapped case: " + swapped.toString());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Main mainClass = new Main();

        System.out.println("Choose a class to run: ");
        System.out.println("1: Multiplication Table");
        System.out.println("2: Pattern");
        System.out.println("3: Continue or Stop Number");
        System.out.println("4: Game");
        System.out.println("5: Swap Case");
        System.out.print("Enter your choice (1/2/3/4/5): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the size of the multiplication table (n): ");
                int n = scanner.nextInt();
                MultiplicationTable multiplicationTable = mainClass.new MultiplicationTable();
                multiplicationTable.printMultiplicationTable(n);
                break;
            case 2:
                System.out.print("Enter the number of rows for the pattern: ");
                int rows = scanner.nextInt();
                Pattern pattern = mainClass.new Pattern();
                pattern.printPattern(rows);
                break;
            case 3:
                ContinueNumber ContinueNumber = mainClass.new ContinueNumber();
                ContinueNumber.continueOrStop();
                break;
            case 4:
                Game Game = mainClass.new Game();
                Game.startGame();
                break;
            case 5:
                System.out.print("Enter a string to swap case: ");
                String inputString = scanner.nextLine();
                SwapCase swapCase = mainClass.new SwapCase();
                swapCase.swapCase(inputString);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        // Close the scanner
        scanner.close();
    }
}
