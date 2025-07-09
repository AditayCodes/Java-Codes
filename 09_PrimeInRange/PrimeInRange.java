
//Program to print Prime numbers in a given range

import java.util.Scanner;
public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upper = sc.nextInt();

        System.out.println("Prime numbers between " + lower + " and " + upper + ":");
        for (int num = lower; num <= upper; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}