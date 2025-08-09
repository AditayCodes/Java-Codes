//Generate all Combinations of Balanced Parentheses using recursion

import java.util.Scanner;

public class BalancedParentheses {

    public static void generateParentheses(int open, int close, String current) {
        if (open == 0 && close == 0) {
            System.out.println(current);
            return;
        }

        if (open > 0) {
            generateParentheses(open - 1, close, current + "(");
        }

        if (close > open) {
            generateParentheses(open, close - 1, current + ")");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of pairs: ");
        int n = sc.nextInt();
        generateParentheses(n, n, "");
        sc.close();
    }
}
