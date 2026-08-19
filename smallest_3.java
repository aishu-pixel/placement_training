import java.util.Scanner;

class smallest_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter third number:");
        int c = sc.nextInt();

        int smallest = a;

        if (b < smallest)
            smallest = b;

        if (c < smallest)
            smallest = c;

        System.out.println("Smallest number is: " + smallest);
        sc.close();
    }
}