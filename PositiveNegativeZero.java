import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.println("Enter the elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] > 0) {
                    positive++;
                } else if (a[i][j] < 0) {
                    negative++;
                } else {
                    zero++;
                }
            }
        }

        System.out.println("Positive elements = " + positive);
        System.out.println("Negative elements = " + negative);
        System.out.println("Zero elements = " + zero);

        sc.close();
    }
}
