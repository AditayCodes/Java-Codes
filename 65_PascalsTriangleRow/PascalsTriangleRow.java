//Find the Nth row in Pascal’s Triangle using recursion

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangleRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object named sc

        System.out.print("Enter the row number (0-indexed): ");
        int n = sc.nextInt();

        List<Integer> row = getPascalsRow(n);
        System.out.println("Row " + n + " of Pascal's Triangle:");
        for (int num : row) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    // Returns the nth row using recursion
    public static List<Integer> getPascalsRow(int n) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            row.add(pascal(n, i));
        }
        return row;
    }

    // Recursive function to compute Pascal(n, k)
    public static int pascal(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // base cases
        }
        return pascal(n - 1, k - 1) + pascal(n - 1, k); // recursive rule
    }
}
