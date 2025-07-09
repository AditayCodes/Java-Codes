
// Check if a Number is Positive or Negative

import java.util.Scanner;
public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        scanner.close();
    }
}

// Output: If the input is 5, it will print "The number is positive."
// If the input is -3, it will print "The number is negative."