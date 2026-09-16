import java.util.Scanner;

public class LargestEachRow {
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

        for (int i = 0; i < rows; i++) {
            int largest = a[i][0];

            for (int j = 1; j < cols; j++) {
                if (a[i][j] > largest) {
                    largest = a[i][j];
                }
            }

            System.out.println("Largest element in row " + (i + 1) + " = " + largest);
        }

        sc.close();
   }
}
