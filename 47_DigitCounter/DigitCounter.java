
//Code to find number of digits in an integer

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object named 'sc'

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = Math.abs(number); // Handles negative numbers

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
        sc.close();
    }
}
