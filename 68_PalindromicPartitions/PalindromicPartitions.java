//Find all possible Palindromic Partitions of the given String 

import java.util.*;

public class PalindromicPartitions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        List<List<String>> result = new ArrayList<>();
        backtrack(input, 0, new ArrayList<>(), result);

        System.out.println("Palindromic Partitions:");
        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }

    // Recursive backtracking function
    public static void backtrack(String s, int start, List<String> current, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String prefix = s.substring(start, end);
            if (isPalindrome(prefix)) {
                current.add(prefix);
                backtrack(s, end, current, result);
                current.remove(current.size() - 1); // Backtrack
            }
        }
    }

    // Helper function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l++) != str.charAt(r--)) return false;
        }
        return true;
    }
}
