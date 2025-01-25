import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int quantity;

    public Book(String title, String author, int quantity) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Quantity: " + quantity);
    }
}

public class BookInventory {
    private static Map<String, Book> bookMap = new HashMap<>();

    public static void acceptBookDetails(int n) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");

            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            bookMap.put(title, new Book(title, author, quantity));
        }
    }

    public static void displayBookQuantity(String title) {
        Book book = bookMap.get(title);
        if (book != null) {
            System.out.println("Quantity of '" + title + "': " + book.getQuantity());
        } else {
            System.out.println("Book not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        acceptBookDetails(n);

        System.out.print("Enter the title of the book to check quantity: ");
        String searchTitle = scanner.nextLine();
        displayBookQuantity(searchTitle);

        scanner.close();
    }
}
