
// Palindrome checker

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num; // Store the original number
        int reversedNum = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Append it to the reversed number
            num /= 10; // Remove the last digit from the original number
        }

        // Check if the original number is equal to the reversed number
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome.");
        } else {
            System.out.println(originalNum + " is not a Palindrome.");
        }     
        sc.close();
    }
}