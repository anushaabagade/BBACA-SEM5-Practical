import java.util.Scanner;

class Shape {
    protected double radius;

    public Shape(double radius) {
        this.radius = radius;
    }

    public double calculateCircleArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Shape {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double calculateSurfaceArea() {
        double circleArea = super.calculateCircleArea(); // Use super keyword to access method from base class
        double lateralSurfaceArea = 2 * Math.PI * radius * height;
        return 2 * circleArea + lateralSurfaceArea;
    }

    public double calculateVolume() {
        return super.calculateCircleArea() * height;
    }
}

public class setaq1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Shape circle = new Shape(radius);
        System.out.println("Area of the circle: " + circle.calculateCircleArea());

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Surface area of the cylinder: " + cylinder.calculateSurfaceArea());
        System.out.println("Volume of the cylinder: " + cylinder.calculateVolume());

        scanner.close();
    }
}
