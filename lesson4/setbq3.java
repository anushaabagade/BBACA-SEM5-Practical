import java.util.Scanner;

class NumberIsSmallException extends Exception {
    public NumberIsSmallException(String message) {
        super(message);
    }
}

class NumberIsGreaterException extends Exception {
    public NumberIsGreaterException(String message) {
        super(message);
    }
}

public class setbq3 {

    public static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 5) {
                throw new NumberIsSmallException("Number is small.");
            }

            if (number > 10) {
                throw new NumberIsGreaterException("Number is Greater.");
            }

            int result = factorial(number);
            System.out.println("The factorial of " + number + " is: " + result);

        } catch (NumberIsSmallException | NumberIsGreaterException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
