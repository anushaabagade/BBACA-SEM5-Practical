import java.util.Scanner;

class setbq1 {
    private int pid;
    private String pname;
    private int age;
    private String gender;

    public setbq1() {
        this.pid = 0;
        this.pname = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
    }

    public setbq1(int pid, String pname, int age, String gender) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }

    public setbq1(int pid, String pname) {
        this(pid, pname, 0, "Unknown");
    }

    public void display() {
        System.out.println("ID: " + pid + ", Name: " + pname + ", Age: " + age + ", Gender: " + gender);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        setbq1[] persons = new setbq1[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Gender: ");
            String gender = scanner.nextLine();

            persons[i] = new setbq1(id, name, age, gender);
        }

        System.out.println("\nDetails of all persons:");
        for (setbq1 person : persons) {
            person.display();
        }

        scanner.close();
    }
}
