
// This program finds the greatest of two numbers.

public class GreatestOTwoNumber {
    public static void main(String[] args) {
        int num1 = 10;          // First number
        int num2 = 20;          // Second number

        // Compare the two numbers and find the greatest
        if (num1 > num2) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
