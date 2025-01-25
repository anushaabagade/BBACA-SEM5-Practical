import java.util.Scanner;

interface Shape {
    double area();
}

final class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

final class Sphere implements Shape {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }
}

public class setaq2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Shape circle = new Circle(circleRadius);
        System.out.println("Area of the circle: " + circle.area());

        System.out.print("Enter the radius of the sphere: ");
        double sphereRadius = scanner.nextDouble();
        Shape sphere = new Sphere(sphereRadius);
        System.out.println("Surface area of the sphere: " + sphere.area());

        scanner.close();
    }
}
