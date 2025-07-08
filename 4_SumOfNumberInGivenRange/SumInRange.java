
//Find the Sum of the Numbers in a Given Range

public class SumInRange {
    public static void main(String[] args) {
        int start = 5;      // Starting number of the range
        int end = 15;       // Ending number of the range
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;       // Add each number in the range to the sum
        }

        System.out.println("The sum of numbers from " + start + " to " + end + " is: " + sum);
    }
}

// Output:
// The sum of numbers from 5 to 15 is: 110