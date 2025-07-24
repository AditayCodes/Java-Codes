
//Find Prime Number between 1 to 100

import java.util.Scanner;

public class PrimeNumbers1To100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        System.out.println("Prime numbers between 1 and 100 are:");

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check if num is divisible by any number from 2 to num-1
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}
