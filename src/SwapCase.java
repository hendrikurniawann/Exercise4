import java.util.Scanner;

public class SwapCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize a StringBuilder to store the result
        StringBuilder swapped = new StringBuilder();

        // Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is lowercase
            if (Character.isLowerCase(ch)) {
                // Convert to uppercase
                swapped.append(Character.toUpperCase(ch));
            }
            // Check if the character is uppercase
            else if (Character.isUpperCase(ch)) {
                // Convert to lowercase
                swapped.append(Character.toLowerCase(ch));
            }
            // If it's not a letter (e.g., space or punctuation), leave it unchanged
            else {
                swapped.append(ch);
            }
        }

        // Print the swapped case result
        System.out.println("Swapped case: " + swapped.toString());

        // Close the scanner
        scanner.close();
    }
}
