import java.util.Scanner;

public class setaq3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Debug: Radius entered = " + radius);
        if (radius > 0) {
            System.out.println("Area of the circle: " + calculateArea(radius));
        } else {
            System.out.println("Radius must be positive.");
        }

        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Debug: Base entered = " + base);
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        System.out.println("Debug: Height entered = " + height);
        if (base > 0 && height > 0) {
            System.out.println("Area of the triangle: " + calculateArea(base, height));
        } else {
            System.out.println("Base and height must be positive.");
        }

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Debug: Length entered = " + length);
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Debug: Width entered = " + width);
        if (length > 0 && width > 0) {
            System.out.println("Area of the rectangle: " + calculateArea(length, width));
        } else {
            System.out.println("Length and width must be positive.");
        }

        scanner.close();
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateArea1(double length, double width) {
        return length * width;
    }
}
