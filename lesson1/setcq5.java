import java.util.Scanner;

public class setcq5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Alternate characters: ");
        for (int i = 0; i < inputString.length(); i += 2) {
            System.out.print(inputString.charAt(i));
        }

        scanner.close();
    }
}
