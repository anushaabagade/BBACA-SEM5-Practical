import java.util.Scanner;
interface NumberCheck {
    void check();
}

class Number implements NumberCheck {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public void check() {
        if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }
}

public class setaq3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        Number number = new Number(num);
        number.check();

        scanner.close();
    }
}
