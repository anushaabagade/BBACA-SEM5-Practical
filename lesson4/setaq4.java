import java.util.Scanner;
class NumberIsZeroException extends Exception {
    public NumberIsZeroException(String message) {
        super(message);
    }
}

public class setaq4 {

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return originalNumber == reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            if (!input.matches("\\d+")) {
                throw new NumberFormatException("Number is Invalid.");
            }

            int number = Integer.parseInt(input);

            if (number == 0) {
                throw new NumberIsZeroException("Number is Zero.");
            }

            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());

        } catch (NumberIsZeroException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
