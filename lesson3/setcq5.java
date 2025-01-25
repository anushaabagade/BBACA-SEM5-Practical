import java.util.Scanner;

public class setcq5 {

    static class FibonacciSeries {
        public void generate(int n) {
            int a = 0, b = 1;
            System.out.print("Fibonacci Series: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
    }

    static class CubeSeries {
        public void generate(int n) {
            System.out.print("Cube Series: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(i * i * i + " ");
            }
            System.out.println();
        }
    }

    static class SquareSeries {
        public void generate(int n) {
            System.out.print("Square Series: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(i * i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the series: ");
        int n = scanner.nextInt();

        FibonacciSeries fibonacci = new FibonacciSeries();
        CubeSeries cube = new CubeSeries();
        SquareSeries square = new SquareSeries();

        fibonacci.generate(n);
        cube.generate(n);
        square.generate(n);

        scanner.close();
    }
}
