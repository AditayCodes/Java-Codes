//Given an integer N the task is to print the F(N)th term using Recursion

import java.util.Scanner;

public class ComputeFn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int result = calculateF(1, 1, N);
        System.out.println("F(" + N + ")th term is: " + result);

        sc.close();
    }

    // Recursive function to calculate F(N)
    static int calculateF(int start, int k, int N) {
        // Base case: when k exceeds N, return 0 (end of recursion)
        if (k > N) return 0;

        int product = 1;
        // Multiply k consecutive numbers starting from 'start'
        for (int i = start; i < start + k; i++) {
            product *= i;
        }

        // Recursive call for next group:
        // new start = start + k, next group has (k+1) numbers
        return product + calculateF(start + k, k + 1, N);
    }
}
