//Prime Number using Recursion

import java.util.Scanner;

public class PrimeChecker {

    // Recursive method to check if a number is prime
    public static boolean isPrime(int number, int divisor) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime
        }
        if (divisor == 1) {
            return true; // no divisors found, so it's prime
        }
        if (number % divisor == 0) {
            return false; // divisible by a number other than 1 and itself
        }
        return isPrime(number, divisor - 1); // recursive check
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num, num / 2)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        sc.close(); 
    }
}
