
// Program for Finding out the Prime Factors of a number

import java.util.Scanner;
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        int number = sc.nextInt();
        System.out.println("Prime factors of " + number + " are:");
        findPrimeFactors(number);
        sc.close();
    }

    public static void findPrimeFactors(int n) {
        // Check for number of 2s that divide n
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // n must be odd at this point, so we can skip even numbers
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // This condition is to check if n is a prime number greater than 2
        if (n > 2) {
            System.out.print(n + " ");
        }
    }
}