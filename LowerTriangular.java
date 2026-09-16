import java.util.Scanner;

public class LowerTriangular {
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

        System.out.println("Lower triangular matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i >= j) {
                    System.out.print(a[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}