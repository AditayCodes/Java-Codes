
// Fibonacci Series

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();

        // Initialize the first two terms
        int a = 0, b = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");

        // Print the Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b; // Calculate next term
            a = b; // Update a to the next term
            b = nextTerm; // Update b to the next term
        }
        sc.close();
    }
}