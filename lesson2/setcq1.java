import java.util.Scanner;

public class setcq1 {
    private int rno;
    private String name;
    private double mark1;
    private double mark2;
    
    class Result {
        private double total;
        private double percentage;
        
        public void calculateResult() {
            total = mark1 + mark2;
            percentage = (total / 200) * 100;
        }
        
        public void displayResult() {
            System.out.printf("Total: %.2f\n", total);
            System.out.printf("Percentage: %.2f%%\n", percentage);
        }
    }
    
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Roll Number: ");
        rno = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        
        System.out.print("Enter Mark 1: ");
        mark1 = scanner.nextDouble();
        
        System.out.print("Enter Mark 2: ");
        mark2 = scanner.nextDouble();
        
        scanner.close();
    }
    
    public void displayMarkSheet() {
        Result result = new Result();
        result.calculateResult(); 
        
        System.out.println("\nMark Sheet:");
        System.out.println("Roll Number: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        result.displayResult();
    }
    
    public static void main(String[] args) {
        setcq1 student = new setcq1();
        student.acceptDetails();
        student.displayMarkSheet();
    }
}
