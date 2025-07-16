
// Abundant Number
//A Number that is smaller than the sum of all it's factors except the number itself is known as an Abundant number.

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        // Find sum of proper divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum > num) {
            System.out.println(num + " is an Abundant number.");
        } else {
            System.out.println(num + " is not an Abundant number.");
        }
        sc.close();
    }
}
