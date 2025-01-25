import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee() {
        this.id = 0;
        this.name = "";
        this.department = "";
        this.salary = 0.0;
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter Employee Department: ");
        this.department = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        this.salary = scanner.nextDouble();
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager() {
        super();
        this.bonus = 0.0;
    }

    public Manager(int id, String name, String department, double salary, double bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    @Override
    public void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Bonus: ");
        this.bonus = scanner.nextDouble();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
    }

    public double getTotalSalary() {
        return getSalary() + bonus;
    }
}

public class setbq2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of managers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Manager[] managers = new Manager[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Manager " + (i + 1) + ":");
            managers[i] = new Manager();
            managers[i].accept();
        }

        Manager maxManager = managers[0];
        for (int i = 1; i < n; i++) {
            if (managers[i].getTotalSalary() > maxManager.getTotalSalary()) {
                maxManager = managers[i];
            }
        }

        System.out.println("\nManager with the Maximum Total Salary:");
        maxManager.display();

        scanner.close();
    }
}
