//Friendly Pair 
//A Friendly Pair is a pair of two numbers where the ratio of each number
// to the sum of its divisors (including itself) is the same.

import java.util.Scanner;
public class FriendlyPair {
    
    // Method to calculate sum of divisors including the number itself
    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);

        if ((double) sum1 / num1 == (double) sum2 / num2) {
            System.out.println(num1 + " and " + num2 + " are Friendly Pairs.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not Friendly Pairs.");
        }

        scanner.close();
    }
}
