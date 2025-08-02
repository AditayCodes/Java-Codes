// Finding number of integers which has exactly X divisors

import java.util.Scanner;

public class ExactDivisorsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: range limit N and number of divisors X
        System.out.print("Enter the upper limit N: ");
        int n = sc.nextInt();

        System.out.print("Enter the exact number of divisors X: ");
        int x = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (countDivisors(i) == x) {
                count++;
            }
        }

        System.out.println("Number of integers from 1 to " + n + " with exactly " + x + " divisors: " + count);

        sc.close();
    }

    // Method to count the number of divisors of a number
    static int countDivisors(int num) {
        int divisors = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i == num)
                    divisors++; // perfect square
                else
                    divisors += 2; // both i and num/i
            }
        }
        return divisors;
    }
}
