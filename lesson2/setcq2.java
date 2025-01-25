import java.util.Scanner;
import java.util.Arrays;

public class setcq2 {
    private static String[] employeeNames;

    // Method to accept employee names
    public static void acceptNames(int n) {
        Scanner scanner = new Scanner(System.in);
        employeeNames = new String[n];

        System.out.println("Enter " + n + " employee names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            employeeNames[i] = scanner.nextLine();
        }
    }

    // Method to sort employee names in ascending order
    public static void sortNames() {
        Arrays.sort(employeeNames);
    }

    // Method to display employee names
    public static void displayNames() {
        System.out.println("\nSorted Employee Names:");
        for (String name : employeeNames) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        acceptNames(n);  // Accept employee names
        sortNames();     // Sort employee names
        displayNames();  // Display sorted names

        scanner.close(); // Close the scanner
    }
}

