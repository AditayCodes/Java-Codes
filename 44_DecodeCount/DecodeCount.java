
// Code to Count Possible Decoding Of A Given Digit Sequence

import java.util.Scanner;

public class DecodeCount {
    public static int countWays(String str) {
        int n = str.length();

        // Base cases
        if (n == 0 || str.charAt(0) == '0') {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        // Start with first two characters
        int prev = 1; // dp[i-2]
        int curr = 1; // dp[i-1]

        for (int i = 1; i < n; i++) {
            int temp = 0;

            // If current digit is not '0', it can stand alone
            if (str.charAt(i) != '0') {
                temp = curr;
            }

            // Check if two-digit number is valid (10 to 26)
            int twoDigit = Integer.parseInt(str.substring(i - 1, i + 1));
            if (twoDigit >= 10 && twoDigit <= 26) {
                temp += prev;
            }

            // Update prev and curr for next iteration
            prev = curr;
            curr = temp;
        }

        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter digit sequence: ");
        String input = sc.nextLine();

        int result = countWays(input);
        System.out.println("Total decoding ways: " + result);
        sc.close();
    }
}
