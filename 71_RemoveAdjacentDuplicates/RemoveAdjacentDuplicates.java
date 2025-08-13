//Given a string s, remove all its adjacent duplicate characters recursively 

import java.util.Scanner;

public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String result = removeAdjacentDuplicates(input);
        System.out.println("Result: " + result);

        sc.close();
    }

    // Recursive method to remove adjacent duplicates
    static String removeAdjacentDuplicates(String s) {
        if (s.length() <= 1) return s;

        StringBuilder result = new StringBuilder();
        int i = 0;
        boolean removed = false;

        while (i < s.length()) {
            // If current and next characters are the same, skip them
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                char duplicate = s.charAt(i);
                removed = true;
                // Skip all duplicates
                while (i < s.length() && s.charAt(i) == duplicate) {
                    i++;
                }
            } else {
                // No duplicate, add to result
                result.append(s.charAt(i));
                i++;
            }
        }

        // If any duplicates were removed, repeat the process
        if (removed) {
            return removeAdjacentDuplicates(result.toString());
        } else {
            return result.toString();
        }
    }
}
