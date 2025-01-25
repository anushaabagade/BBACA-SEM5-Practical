import java.util.Scanner;

public class setbq4 {
    private int number;

    public setbq4() {
        this.number = 0;
    }

    public setbq4(int number) {
        this.number = number;
    }

    public boolean isNegative() {
        return number < 0;
    }

    public boolean isPositive() {
        return number > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int value = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                value = Integer.parseInt(scanner.nextLine());
                validInput = true; // Input is valid, exit loop
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid integer: ");
            }
        }

        setbq4 myNumber = new setbq4(value);

        System.out.println("Is the number negative? " + myNumber.isNegative());
        System.out.println("Is the number positive? " + myNumber.isPositive());

        scanner.close();
    }
}
