import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class setaq2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        scanner.close();
    }
}
