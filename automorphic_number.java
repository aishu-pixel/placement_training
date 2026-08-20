import java.util.Scanner;

class automorphic_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int square = n * n;

        if (square % 10 == n % 10)
            System.out.println(n + " is an Automorphic Number");
        else
            System.out.println(n + " is not an Automorphic Number");
        sc.close();
    }
}
