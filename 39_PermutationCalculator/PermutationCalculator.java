
//Permutations in which n people can occupy r seats in a classroom

import java.util.Scanner;

public class PermutationCalculator {
    
    // Method to calculate factorial
    public static long factorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate permutation P(n, r)
    public static long permutation(int n, int r) {
        if (r > n) {
            System.out.println("Number of seats cannot be more than number of people.");
            return 0;
        }
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter the number of people (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the number of seats (r): ");
        int r = sc.nextInt();

        long result = permutation(n, r);
        System.out.println("Number of permutations: " + result);

        sc.close();
    }
}
