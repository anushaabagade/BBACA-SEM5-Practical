import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class setbq4 {

    public static void main(String[] args) {
        String filePath = "example.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            Stack<String> linesStack = new Stack<>();

            String line;
            while ((line = reader.readLine()) != null) {
                linesStack.push(line);
            }

            System.out.println("File content in reverse order:");
            while (!linesStack.isEmpty()) {
                System.out.println(linesStack.pop());
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
