import java.util.Scanner;

class contains_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        boolean found = false;

        while (n > 0) {
            if (n % 10 == 0) {
                found = true;
                break;
            }

            n = n / 10;
        }

        if (found)
            System.out.println("The number contains 0");
        else
            System.out.println("The number does not contain 0");
        sc.close();
    }
}