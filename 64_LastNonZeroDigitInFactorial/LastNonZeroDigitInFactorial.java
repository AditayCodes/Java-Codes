//Last non-zero digit in factorial using recursion

import java.util.Scanner;

public class LastNonZeroDigitInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object named sc

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = findLastNonZeroDigit(n);
        System.out.println("Last non-zero digit in " + n + "! is: " + result);

        sc.close();
    }

    // Recursive function to find factorial and track last non-zero digit
    public static int findLastNonZeroDigit(int n) {
        if (n == 0 || n == 1) return 1;

        int res = findLastNonZeroDigit(n - 1) * n;

        // Remove trailing zeros
        while (res % 10 == 0) {
            res /= 10;
        }

        // Keep result small to avoid overflow (keep last 4-5 digits)
        return res % 100000;
    }
}
