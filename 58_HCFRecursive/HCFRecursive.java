//HCF of a Number using Recursion

import java.util.Scanner;

public class HCFRecursive {

    // Recursive function to calculate HCF using Euclidean algorithm
    public static int findHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findHCF(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate and print HCF
        int hcf = findHCF(Math.abs(num1), Math.abs(num2)); // Handle negative inputs
        System.out.println("HCF: " + hcf);

        sc.close();
    }
}
