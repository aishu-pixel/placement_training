import java.util.Scanner;

class largest_3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter third number:");
        int c = sc.nextInt();

        int largest = a;

        if (b > largest)
            largest = b;

        if (c > largest)
            largest = c;

        System.out.println("Largest number is: " + largest);
        sc.close();
    }
}
