import java.util.Scanner;

class remove_lastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int result = n / 10;

        System.out.println("Number after removing last digit: " + result);
        sc.close();
    }
}