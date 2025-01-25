import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class setbq1 {

    public static char modifyChar(char ch) {
        if (Character.isDigit(ch)) {
            return '*';
        }
        else if (Character.isUpperCase(ch)) {
            return Character.toLowerCase(ch);
        }
        else if (Character.isLowerCase(ch)) {
            return Character.toUpperCase(ch);
        }
        return ch;
    }

    public static void main(String[] args) {
        String sourceFilePath = "source.txt";
        String targetFilePath = "target.txt";

        try (FileReader fileReader = new FileReader(sourceFilePath);
             FileWriter fileWriter = new FileWriter(targetFilePath)) {

            int character;
            
            while ((character = fileReader.read()) != -1) {
                char modifiedChar = modifyChar((char) character);
                
                fileWriter.write(modifiedChar);
            }

            System.out.println("File copied with modifications successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
