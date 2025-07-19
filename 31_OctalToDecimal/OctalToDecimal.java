
// Octal to decimal Conversion

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an octal number
        System.out.print("Enter an octal number: ");
        String octal = scanner.nextLine();  // Read the octal number from user input
        
        // Convert octal to decimal using the octalToDecimal method
        int decimal = octalToDecimal(octal);
        
        // Output the result
        System.out.println("Octal: " + octal + " => Decimal: " + decimal);
        
        // Close the scanner object to prevent resource leak
        scanner.close();
    }

    // Method to convert octal to decimal
    public static int octalToDecimal(String octal) {
        int decimal = 0;
        int length = octal.length();

        // Loop through each character in the octal string
        for (int i = 0; i < length; i++) {
            // Get the current digit (0 to 7)
            char digit = octal.charAt(i);

            // If the digit is valid (0-7), calculate its decimal value and add it to the result
            if (digit >= '0' && digit <= '7') {
                decimal += (digit - '0') * Math.pow(8, length - 1 - i);
            } else {
                // If an invalid digit is encountered, display an error
                System.out.println("Invalid octal digit: " + digit);
                return -1;
            }
        }
        return decimal;
    }
}


