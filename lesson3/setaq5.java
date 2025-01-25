import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class setaq5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        scanner.close();

        Collections.reverse(numbers);

        System.out.println("Elements in reverse order:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
