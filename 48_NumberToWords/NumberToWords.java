//Program to convert Digits/Numbers to Words

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        if (number < 0) {
            System.out.print("Minus ");
            number = Math.abs(number);
        }

        String[] words = {
            "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
        };

        // To store original number for trailing zero handling
        int originalNumber = number;

        // Reverse the number to print digits in correct order
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        // Print digits in correct word form
        while (reversed > 0) {
            int digit = reversed % 10;
            System.out.print(words[digit] + " ");
            reversed /= 10;
        }

        // Handle trailing zeroes (e.g., 1000 → "One Zero Zero Zero")
        int zeroCount = 0;
        while (originalNumber % 10 == 0) {
            zeroCount++;
            originalNumber /= 10;
        }

        for (int i = 0; i < zeroCount; i++) {
            System.out.print("Zero ");
        }

        System.out.println();
        sc.close();
    }
}
