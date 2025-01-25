import java.util.Scanner;

class Product {
    private int pid;
    private String pname;
    private double price;

    public void acceptDetails(Scanner scanner) {
        System.out.print("Enter Product ID: ");
        this.pid = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Product Name: ");
        this.pname = scanner.nextLine();

        System.out.print("Enter Product Price: ");
        this.price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + pid + ", Name: " + pname + ", Price: Rs " + price);
    }

    // Method to get product price
    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Product[] products = new Product[numProducts];

        // Accept details for each product
        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            products[i] = new Product();
            products[i].acceptDetails(scanner);
        }

        System.out.println("\nProduct Details:");
        double totalAmount = 0;

        // Display details and calculate total amount
        for (Product product : products) {
            product.displayDetails();
            totalAmount += product.getPrice();
        }

        System.out.println("\nTotal Amount: Rs " + totalAmount);

        scanner.close();
    }
}
