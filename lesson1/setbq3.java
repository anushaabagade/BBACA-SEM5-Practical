import java.util.Scanner;

public class setbq3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[n];

        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.print("Enter the name to search: ");
        String searchName = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) { 
                System.out.println("Name found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Name not found in the array.");
        }

        scanner.close();
    }
}
