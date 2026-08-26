import java.util.Scanner;

class print_1_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int n = sc.nextInt();

        System.out.println("Numbers from 1 to " + n + ":");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
