//Reversing a Number using Recursion

import java.util.Scanner;

public class ReverseNumberRecursive {

    // Recursive function to reverse the number
    public static int reverseNumber(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        return reverseNumber(num / 10, rev * 10 + num % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();

        // Handle negative numbers
        int reversed = reverseNumber(Math.abs(num), 0);
        if (num < 0) {
            reversed = -reversed;
        }

        // Output result
        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}
