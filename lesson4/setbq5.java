import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class setbq5 {

    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        String filePath = "example.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            System.out.println("Each word in reverse order:");

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    System.out.print(reverseWord(word) + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
