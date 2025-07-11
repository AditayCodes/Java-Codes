
// Armstrong numbers

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();

        int originalNumber = number;

        // Extract each digit and calculate the cube
        int digit1 = number % 10;
        number = number / 10;

        int digit2 = number % 10;
        number = number / 10;

        int digit3 = number % 10;

        int sum = (digit1 * digit1 * digit1) +
                  (digit2 * digit2 * digit2) +
                  (digit3 * digit3 * digit3);

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }
        sc.close();
    }
}
