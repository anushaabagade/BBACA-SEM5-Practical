import java.util.Arrays;
import java.util.Scanner;

public class setbq1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of city names: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] cities = new String[n];

        System.out.println("Enter " + n + " city names:");
        for (int i = 0; i < n; i++) {
            cities[i] = scanner.nextLine();
        }

        Arrays.sort(cities);

        System.out.println("City names in ascending order:");
        for (String city : cities) {
            System.out.println(city);
        }

        scanner.close();
    }
}
