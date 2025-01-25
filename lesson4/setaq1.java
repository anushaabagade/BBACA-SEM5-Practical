import java.util.Scanner;

public class setaq1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of values separated by spaces:");

        String input = scanner.nextLine();

        String[] inputs = input.split(" ");

        int count = 0;

        for (String arg : inputs) {
            try {
                Integer.parseInt(arg);
                count++;
            } catch (NumberFormatException e) {
            }
        }

        System.out.println("Number of integers in the given list: " + count);

        scanner.close();
    }
}
