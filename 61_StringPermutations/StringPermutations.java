//Print All Permutations of a String using Recursion

import java.util.Scanner;

public class StringPermutations {

    // Recursive method to print all permutations
    public static void printPermutations(String str, String result) {
        // Base case: if input string is empty, print the result
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        // Go through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Pick character at index i
            char ch = str.charAt(i);

            // Remaining string without the picked character
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // Recursive call with remaining string and updated result
            printPermutations(remaining, result + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("All permutations:");
        printPermutations(input, "");

        sc.close();
    }
}
