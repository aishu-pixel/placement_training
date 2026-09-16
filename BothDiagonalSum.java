import java.util.Scanner;

public class BothDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of square matrix: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int mainSum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            mainSum += a[i][i];
            secondarySum += a[i][n - 1 - i];
        }

        System.out.println("Sum of main diagonal = " + mainSum);
        System.out.println("Sum of secondary diagonal = " + secondarySum);
        System.out.println("Sum of both diagonals = " + (mainSum + secondarySum));

        sc.close();
    }
}