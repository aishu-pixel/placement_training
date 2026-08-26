import java.util.Scanner;

class print_N_to_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int n = sc.nextInt();

        System.out.println("Numbers from " + n + " to 1:");

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}