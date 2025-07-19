
// Binary To Decimal Conversion

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();  // Read the binary number from user input
        
        // Convert binary to decimal using the binaryToDecimal method
        int decimal = binaryToDecimal(binary);
        
        // Output the result
        System.out.println("Binary: " + binary + " => Decimal: " + decimal);
        
        // Close the scanner object to prevent resource leak
        sc.close();
    }

    // Method to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        // Loop through each character in the binary string
        for (int i = 0; i < length; i++) {
            // Get the current bit (0 or 1)
            char bit = binary.charAt(i);

            // If the bit is '1', calculate its decimal value and add it to the result
            if (bit == '1') {
                decimal += Math.pow(2, length - 1 - i);
            }
        }
        return decimal;
    }
}
