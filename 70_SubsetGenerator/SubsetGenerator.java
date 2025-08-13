//Given a set of positive integers, find all its subsets using recusrion

import java.util.*;

public class SubsetGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " positive integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> allSubsets = new ArrayList<>();
        generateSubsets(0, arr, new ArrayList<>(), allSubsets);

        System.out.println("All subsets:");
        for (List<Integer> subset : allSubsets) {
            System.out.println(subset);
        }

        sc.close();
    }

    static void generateSubsets(int index, int[] arr, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current)); // add a copy of current subset
            return;
        }

        // Include current element
        current.add(arr[index]);
        generateSubsets(index + 1, arr, current, result);

        // Exclude current element (backtrack)
        current.remove(current.size() - 1);
        generateSubsets(index + 1, arr, current, result);
    }
}
