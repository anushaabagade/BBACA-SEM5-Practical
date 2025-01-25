import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class setcq3 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileStats <file-path>");
            return;
        }

        String filePath = args[0];
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
