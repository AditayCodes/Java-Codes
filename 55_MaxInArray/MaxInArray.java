//Recursive Program to find Largest Element of the array

import java.util.Scanner;

public class MaxInArray {

    // Recursive method to find the largest element
    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index]; // base case: last element
        }

        int maxInRest = findMax(arr, index + 1); // recursive call
        return Math.max(arr[index], maxInRest); // compare current and rest
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = findMax(arr, 0); // start recursion from index 0

        System.out.println("The largest element in the array is: " + max);

        sc.close(); 
    }
}
