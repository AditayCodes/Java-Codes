//To Calculate length of The String Using Recursion

import java.util.Scanner;

public class StringLengthRecursion {

    // Recursive method to calculate string length
    public static int getStringLength(String str) {
        // Base case: if string is empty
        if (str.equals("")) {
            return 0;
        }
        // Recursive case: remove first character and count 1
        return 1 + getStringLength(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int length = getStringLength(input);

        System.out.println("Length of the string is: " + length);

        sc.close(); 
    }
}
