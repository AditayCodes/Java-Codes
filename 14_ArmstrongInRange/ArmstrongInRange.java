
// Armstrong In Range

import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the range
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        // Loop through the range and check for Armstrong numbers
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        for (int num = start; num <= end; num++) {
            int sum = 0;
            int temp = num;

            // Extract each digit and calculate the sum of its cubes
            while (temp > 0) {
                int digit = temp % 10; // Get last digit
                sum += digit * digit * digit; // Cube the digit
                temp /= 10; // Remove last digit
            }

            // If sum equals the original number, it's an Armstrong number
            if (sum == num) {
                System.out.println(num);
            }
        }
        sc.close();
    }
}


