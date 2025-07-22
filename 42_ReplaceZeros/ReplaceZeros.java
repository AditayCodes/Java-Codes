
//Replace all 0’s with 1 in a given integer

import java.util.Scanner;

public class ReplaceZeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Convert integer to string, replace 0s with 1s, then convert back to int
        String replacedString = String.valueOf(number).replace('0', '1');
        int result = Integer.parseInt(replacedString);

        // Output result
        System.out.println("Modified integer: " + result);

        sc.close();
    }
}
