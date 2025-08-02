// Occurrence of a digit in a given number

import java.util.Scanner;

public class DigitOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number and digit
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter the digit to count: ");
        int digit = sc.nextInt();

        int count = 0;
        int temp = Math.abs(number); // handle negative numbers

        while (temp > 0) {
            int lastDigit = temp % 10;
            if (lastDigit == digit) {
                count++;
            }
            temp /= 10;
        }

        System.out.println("The digit " + digit + " occurs " + count + " times in " + number);

        sc.close();
    }
}
