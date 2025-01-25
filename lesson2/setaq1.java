import java.util.Scanner;

public class setaq1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = power(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
}
