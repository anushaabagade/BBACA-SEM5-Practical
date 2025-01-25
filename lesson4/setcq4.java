import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class setcq4 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CharacterProcessor <file-path>");
            return;
        }

        String filePath = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                char character = (char) ch;

                if (Character.isLetter(character)) {
                    if (Character.isUpperCase(character)) {
                        System.out.print(Character.toLowerCase(character));
                    } else {
                        System.out.print(Character.toUpperCase(character));
                    }
                } else {
                    if (Character.isDigit(character)) {
                        System.out.println(character + " is a Digit");
                    } else if (Character.isWhitespace(character)) {
                        System.out.println("Space");
                    } else {
                        System.out.println(character + " is a Special Character");
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
