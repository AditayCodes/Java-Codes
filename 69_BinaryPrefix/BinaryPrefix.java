// Print N-bit binary numbers having more 1’s than 0’s in all prefixes using recusion

import java.util.Scanner;

public class BinaryPrefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter value of N: ");
        int N = sc.nextInt();
        generateBinary(N, "", 0, 0);
        sc.close();
    }

    static void generateBinary(int N, String result, int ones, int zeros) {
        if (result.length() == N) {
            System.out.println(result);
            return;
        }

        // Always add 1
        generateBinary(N, result + "1", ones + 1, zeros);

        // Add 0 only if ones > zeros
        if (ones > zeros) {
            generateBinary(N, result + "0", ones, zeros + 1);
        }
    }
}
