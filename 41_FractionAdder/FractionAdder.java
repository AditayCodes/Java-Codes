
//Add two fractions

import java.util.Scanner;

public class FractionAdder {

    // Method to compute GCD (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first fraction
        System.out.print("Enter numerator of first fraction: ");
        int num1 = sc.nextInt();
        System.out.print("Enter denominator of first fraction: ");
        int den1 = sc.nextInt();

        // Input second fraction
        System.out.print("Enter numerator of second fraction: ");
        int num2 = sc.nextInt();
        System.out.print("Enter denominator of second fraction: ");
        int den2 = sc.nextInt();

        // Calculate numerator and denominator of result
        int numerator = (num1 * den2) + (num2 * den1);
        int denominator = den1 * den2;

        // Simplify the fraction
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        // Output result
        System.out.println("Sum of fractions: " + numerator + "/" + denominator);

        sc.close();
    }
}
