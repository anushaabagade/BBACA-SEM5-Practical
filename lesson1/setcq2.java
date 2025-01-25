public class setcq2 {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "java", "programming"};

        System.out.println("Original words and their reversed versions:");
        for (String word : words) {
            String reversedWord = reverseString(word);
            System.out.println("Original: " + word + " | Reversed: " + reversedWord);
        }
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
