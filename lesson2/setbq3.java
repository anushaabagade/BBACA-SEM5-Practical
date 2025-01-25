import java.util.Scanner;

class Student {
    private int rollno;
    private String name;
    private double per;

    public Student(int rollno, String name, double per) {
        this.rollno = rollno;
        this.name = name;
        this.per = per;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + name + ", Percentage: " + per;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");

            System.out.print("Enter Roll Number: ");
            int rollno = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Percentage: ");
            double per = scanner.nextDouble();
            scanner.nextLine();

            students[i] = new Student(rollno, name, per);
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
