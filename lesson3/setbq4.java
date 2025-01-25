import java.util.Hashtable;
import java.util.Scanner;

public class setbq4 {
    public static void main(String[] args) {
        Hashtable<String, Double> employeeTable = new Hashtable<>();

        employeeTable.put("Alice", 55000.00);
        employeeTable.put("Bob", 60000.00);
        employeeTable.put("Charlie", 75000.00);
        employeeTable.put("David", 65000.00);

        System.out.println("Employee Details:");
        for (String name : employeeTable.keySet()) {
            System.out.println("Name: " + name + ", Salary: Rs " + employeeTable.get(name));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the name of the employee to search: ");
        String searchName = scanner.nextLine();

        if (employeeTable.containsKey(searchName)) {
            double salary = employeeTable.get(searchName);
            System.out.println("Salary of " + searchName + ": Rs " + salary);
        } else {
            System.out.println("Employee not found.");
        }

        scanner.close();
    }
}
