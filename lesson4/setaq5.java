import java.util.Scanner;
class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

public class setaq5 {

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 100) {
                throw new NumberOutOfRangeException("Number is out of Range.");
            }

            int sum = sumOfDigits(number);
            System.out.println("The sum of digits of " + number + " is: " + sum);

        } catch (NumberOutOfRangeException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
