import java.util.Scanner;
import java.util.ArrayList;

public class setbq2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of numbers: ");
        int n = scanner.nextInt();

        ArrayList<Integer> armstrongNumbers = new ArrayList<>();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (isArmstrong(num)) {
                armstrongNumbers.add(num);
            }
        }

        System.out.println("Armstrong numbers from the given input:");
        for (int number : armstrongNumbers) {
            System.out.println(number);
        }

        scanner.close();
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int result = 0;
        int digits = Integer.toString(num).length();

        while (num != 0) {
            int remainder = num % 10;
            result += Math.pow(remainder, digits);
            num /= 10;
        }

        return result == originalNum;
    }
}
