import java.util.ArrayList;
import java.util.Scanner;

public class ContinueNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();  // Using ArrayList to store the inputs

        // Loop to take inputs and decide whether to continue or stop
        while (true) {
            // Ask for input number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            inputs.add(number);  // Add the input to the list

            // Ask whether to continue or stop
            System.out.print("Press 'y' to continue or 'n' to stop: ");
            char choice = scanner.next().charAt(0);

            if (choice == 'n' || choice == 'N') {
                break;  // Exit the loop if 'n' is pressed
            }
        }

        // Display the inputs
        System.out.println("You entered: " + inputs);

        // Close the scanner
        scanner.close();
    }
}
