import java.util.Arrays;
import java.util.Scanner;

public class setaq3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[100];
        int count = 0;

        System.out.println("Enter positive real numbers (enter 0 to end):");

        while (true) {
            double number = scanner.nextDouble();

            if (number == 0) {
                break;
            }

            if (number > 0) {
                if (count < numbers.length) {
                    numbers[count++] = number;
                } else {
                    System.out.println("The limit of 100 numbers has been reached.");
                    break;
                }
            } else {
                System.out.println("Please enter a positive number.");
            }
        }

        Arrays.sort(numbers, 0, count);

        System.out.println("Numbers in sorted order:");
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}
