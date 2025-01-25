import java.util.*;

class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

public class setaq2 {
    
    public static void checkEligibility(int age) throws UnderageException {
        if (age < 18) {
            throw new UnderageException("You are under 18, not eligible for voting.");
        } else {
            System.out.println("You are eligible for voting.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            checkEligibility(age);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number for age.");

        } catch (UnderageException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
