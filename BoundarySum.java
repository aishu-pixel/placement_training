import java.util.Scanner;

public class BoundarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int sum = 0;

        System.out.println("Enter the elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    sum += a[i][j];
                }
            }
        }

        System.out.println("Sum of boundary elements = " + sum);

        sc.close();
    }
}
