import java.util.Scanner;

public class SecondaryDiagonal {
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

        System.out.println("Secondary diagonal elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i][n - 1 - i] + " ");
        }

        sc.close();
    }
}
