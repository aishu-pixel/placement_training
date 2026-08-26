import java.util.Scanner;

class sum_even_upto_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 2; i <= n; i = i + 2) {
            sum = sum + i;
        }

        System.out.println("Sum of even numbers up to " + n + " is: " + sum);
        sc.close();
    }
}
