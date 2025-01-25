import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

public class setcq5 {

    public static void validatePAN(String pan) throws InvalidDataException {
        String panRegex = "^[A-Z]{5}[0-9]{4}[A-Z]$";
        if (!Pattern.matches(panRegex, pan)) {
            throw new InvalidDataException("Invalid PAN number");
        }
    }

    public static void validateMobile(String mobile) throws InvalidDataException {
        String mobileRegex = "^[0-9]{10}$";
        if (!Pattern.matches(mobileRegex, mobile)) {
            throw new InvalidDataException("Invalid Mobile number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter PAN number: ");
        String pan = scanner.nextLine();

        System.out.print("Enter Mobile number: ");
        String mobile = scanner.nextLine();

        try {
            validatePAN(pan);
            System.out.println("Valid PAN number: " + pan);

            validateMobile(mobile);
            System.out.println("Valid Mobile number: " + mobile);

        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
