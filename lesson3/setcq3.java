import java.util.ArrayList;
import java.util.Scanner;

abstract class Staff {
    protected String name;
    protected String address;

    public Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract void displayDetails();
}

class FullTimeStaff extends Staff {
    private String department;
    private double salary;

    public FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Full-Time Staff");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

class PartTimeStaff extends Staff {
    private int numberOfHours;
    private double ratePerHour;

    public PartTimeStaff(String name, String address, int numberOfHours, double ratePerHour) {
        super(name, address);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public void displayDetails() {
        System.out.println("Part-Time Staff");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Number of Hours: " + numberOfHours);
        System.out.println("Rate Per Hour: " + ratePerHour);
        System.out.println();
    }
}

public class setcq3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Staff> staffList = new ArrayList<>();

        System.out.print("Enter number of staff members: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for staff member " + (i + 1));
            System.out.print("Enter type (FullTime/PartTime): ");
            String type = scanner.nextLine();
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter address: ");
            String address = scanner.nextLine();

            if (type.equalsIgnoreCase("FullTime")) {
                System.out.print("Enter department: ");
                String department = scanner.nextLine();
                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                staffList.add(new FullTimeStaff(name, address, department, salary));
            } else if (type.equalsIgnoreCase("PartTime")) {
                System.out.print("Enter number of hours: ");
                int numberOfHours = scanner.nextInt();
                System.out.print("Enter rate per hour: ");
                double ratePerHour = scanner.nextDouble();
                scanner.nextLine();
                staffList.add(new PartTimeStaff(name, address, numberOfHours, ratePerHour));
            } else {
                System.out.println("Invalid type! Please enter FullTime or PartTime.");
                i--;
            }
        }

        System.out.println("\nDisplaying Staff Details:");
        for (Staff staff : staffList) {
            staff.displayDetails();
        }

        scanner.close();
    }
}
