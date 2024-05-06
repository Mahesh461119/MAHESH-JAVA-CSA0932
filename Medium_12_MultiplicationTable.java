import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for m and n
        System.out.print("Enter the value of M: ");
        int m = scanner.nextInt();
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        scanner.close();

        // Print the multiplication table of m up to n
        printMultiplicationTable(m, n);
    }

    public static void printMultiplicationTable(int m, int n) {
        for (int i = 1; i <= n; i++) {
            int result = m * i;
            System.out.println(i + "x" + m + "=" + result);
        }
    }
}
