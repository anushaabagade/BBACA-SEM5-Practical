import java.util.Scanner;

public class setaq3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee name: ");
        String employeeName = scanner.nextLine();

        String reversedName = "";
        for (int i = employeeName.length() - 1; i >= 0; i--) {
            reversedName += employeeName.charAt(i);
        }
        System.out.println("Employee name in reverse order: " + reversedName);

        scanner.close();
    }
}
