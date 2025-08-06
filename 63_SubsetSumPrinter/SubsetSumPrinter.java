//Print sums of all subsets of a given set using recursion

import java.util.*;

public class SubsetSumPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object named sc

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> result = new ArrayList<>();
        generateSubsetSums(0, 0, arr, result);

        // Optional: sort the subset sums
        Collections.sort(result);

        // Output all subset sums
        System.out.println("Sums of all subsets:");
        for (int sum : result) {
            System.out.print(sum + " ");
        }

        sc.close();
    }

    // Recursive method to generate all subset sums
    public static void generateSubsetSums(int index, int currentSum, int[] arr, List<Integer> result) {
        if (index == arr.length) {
            result.add(currentSum); // Base case: add the sum of current subset
            return;
        }

        // Include current element
        generateSubsetSums(index + 1, currentSum + arr[index], arr, result);

        // Exclude current element
        generateSubsetSums(index + 1, currentSum, arr, result);
    }
}
