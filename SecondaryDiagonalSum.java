import java.util.Scanner;

public class SecondaryDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of square matrix: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int sum = 0;

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            sum += a[i][n - 1 - i];
        }

        System.out.println("Sum of secondary diagonal = " + sum);

        sc.close();
    }
}