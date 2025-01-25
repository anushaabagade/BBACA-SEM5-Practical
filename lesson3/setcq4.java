import java.util.Scanner;

interface Shape {
    double area();
}

class Rectangle implements Shape {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double area() {
        return super.area();
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class setcq4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of Rectangle: ");
        double rectLength = scanner.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double rectWidth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectLength, rectWidth);

        System.out.print("Enter side of Square: ");
        double side = scanner.nextDouble();
        Square square = new Square(side);

        System.out.print("Enter radius of Circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        System.out.println("\nArea of Rectangle: " + rectangle.area());
        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Circle: " + circle.area());

        scanner.close();
    }
}
