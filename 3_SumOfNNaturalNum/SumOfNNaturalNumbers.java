
//// Program to find the sum of first N natural numbers

public class SumOfNNaturalNumbers {
    
    public static int sum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("The sum of first " + n + " natural numbers is: " + sum(n));
    }
}


// Output: The sum of first 10 natural numbers is: 55



//Method -2
/* 
public class SumOfNNaturalNumbers {
    
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("The sum of first " + n + " natural numbers is: " + sum(n));
    }
}
*/