abstract class Shape {
    abstract double calc_area();

    abstract double calc_volume();
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calc_area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double calc_volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}

class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calc_area() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double calc_volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

public class setbq1 {
    public static void main(String[] args) {
        Shape sphere = new Sphere(5.0);
        System.out.println("Sphere:");
        System.out.println("Area: " + sphere.calc_area());
        System.out.println("Volume: " + sphere.calc_volume());

        Shape cone = new Cone(5.0, 10.0);
        System.out.println("\nCone:");
        System.out.println("Area: " + cone.calc_area());
        System.out.println("Volume: " + cone.calc_volume());
    }
}
