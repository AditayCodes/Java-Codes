//Program to find Smallest Element of the array using Recursion

import java.util.Scanner;

public class SmallestElementRecursive {
    
    // Recursive function to find the smallest element
    public static int findSmallest(int[] arr, int n) {
        // Base case: only one element
        if (n == 1) {
            return arr[0];
        }
        
        // Recursive case: find the smallest in the rest of the array
        int smallestInRest = findSmallest(arr, n - 1);
        
        // Return the smaller between last element and smallest in rest
        return Math.min(arr[n - 1], smallestInRest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Create and input array
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and print the smallest element
        int smallest = findSmallest(arr, n);
        System.out.println("Smallest element: " + smallest);

        sc.close();
    }
}
