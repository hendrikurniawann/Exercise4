import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Print column headers
        System.out.print("    ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("    " + "-".repeat(n * 4));

        // Print rows with row headers and values
        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d |", i);  // Row header
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

