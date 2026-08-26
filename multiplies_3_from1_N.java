import java.util.Scanner;

class multiplies_3_from1_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0)
                count++;
        }

        System.out.println("Number of multiples of 3 from 1 to " + n + " is: " + count);
        sc.close();
    }
}
