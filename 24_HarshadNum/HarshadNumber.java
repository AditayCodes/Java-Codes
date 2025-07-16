
// Harshad Number
// A Harshad number is a number that is divisible by the sum of its digits.

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;  // Add last digit
            num /= 10;        // Remove last digit
        }
        if (original % sum == 0) {
            System.out.println(original + " is a Harshad number.");
        } else {
            System.out.println(original + " is not a Harshad number.");
        }
        sc.close();
    }
}
