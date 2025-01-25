import java.util.*;

public class setcq3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        Set<Integer> unionSet = new HashSet<>();

        for (int num : array1) {
            unionSet.add(num);
        }

        for (int num : array2) {
            unionSet.add(num);
        }

        System.out.println("Union of the two arrays:");
        for (int num : unionSet) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
