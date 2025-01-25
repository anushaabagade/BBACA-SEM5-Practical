public class setaq4 {
    private int rollno;
    private String name;
    private static int count = 0;

    public setaq4() {
        this.rollno = 0;
        this.name = "Unknown";
        count++;
        displayCount();
    }

    public setaq4(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        count++;
        displayCount();
    }

    private void displayCount() {
        System.out.println("Number of Student objects created: " + count);
    }

    @Override
    public String toString() {
        return "Student[Roll No: " + rollno + ", Name: " + name + "]";
    }

    public static void main(String[] args) {
        setaq4 s1 = new setaq4(101, "Alice");
        setaq4 s2 = new setaq4(102, "Bob");
        
        System.out.println(s1);
        System.out.println(s2);
    }
}
