//Power of a Number using Recursion

import java.util.Scanner;

public class PowerCalculator {

    // Recursive method to calculate power
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; // Base case: any number to the power of 0 is 1
        } else {
            return base * power(base, exponent - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        int result = power(base, exponent);

        System.out.println(base + " raised to the power " + exponent + " is: " + result);

        sc.close(); 
    }
}
