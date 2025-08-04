//LCM of Two Numbers using Recursion

import java.util.Scanner;

public class LCMRecursive {

    // Recursive function to calculate HCF using Euclidean algorithm
    public static int findHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findHCF(b, a % b);
    }

    // Function to calculate LCM using HCF
    public static int findLCM(int a, int b) {
        return Math.abs(a * b) / findHCF(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Handle zero input case
        if (num1 == 0 || num2 == 0) {
            System.out.println("LCM is not defined for zero.");
        } else {
            int lcm = findLCM(num1, num2);
            System.out.println("LCM: " + lcm);
        }

        sc.close();
    }
}
