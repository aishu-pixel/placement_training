import java.util.Scanner;

public class LargestEachColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        System.out.println("Enter the elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < cols; j++) {
            int largest = a[0][j];

            for (int i = 1; i < rows; i++) {
                if (a[i][j] > largest) {
                    largest = a[i][j];
                }
            }

            System.out.println("Largest element in column " + (j + 1) + " = " + largest);
        }

        sc.close();
    }
}
