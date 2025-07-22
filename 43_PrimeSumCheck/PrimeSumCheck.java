
//Can a number be expressed as a sum of two prime numbers

import java.util.Scanner;

public class PrimeSumCheck {

    // Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean found = false;

        // Check for every number if it and (num - i) are prime
        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(num + " = " + i + " + " + (num - i));
                found = true;
            }
        }

        if (!found) {
            System.out.println(num + " cannot be expressed as the sum of two prime numbers.");
        }

        sc.close();
    }
}
