import java.util.Scanner;

public class setaq1 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Convert the name to uppercase
        String upperCaseName = name.toUpperCase();

        System.out.println("Hello, " + upperCaseName + ", nice to meet you!");

        scanner.close();
    }
}
