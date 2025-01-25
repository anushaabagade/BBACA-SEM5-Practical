import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class setbq2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String filePath = "ascii_output.txt";

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            for (int i = 0; i < inputString.length(); i++) {
                char ch = inputString.charAt(i);
                int asciiValue = (int) ch;

                fileWriter.write("Character: " + ch + " ASCII: " + asciiValue + "\n");
            }

            System.out.println("ASCII values have been written to the file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
