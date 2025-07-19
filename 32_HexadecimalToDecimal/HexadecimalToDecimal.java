
//Hexadecimal to Decimal Conversion

import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a hexadecimal number
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.nextLine();  // Read the hexadecimal number from user input

        // Convert hexadecimal to decimal using the hexToDecimal method
        int decimal = hexToDecimal(hexadecimal);

        // Output the result
        if (decimal != -1) {
            System.out.println("Hexadecimal: " + hexadecimal + " => Decimal: " + decimal);
        }

        // Close the scanner object to prevent resource leak
        scanner.close();
    }

    // Method to convert hexadecimal to decimal
    public static int hexToDecimal(String hexadecimal) {
        int decimal = 0;
        int length = hexadecimal.length();

        // Loop through each character in the hexadecimal string
        for (int i = 0; i < length; i++) {
            // Get the current character (hex digit)
            char hexDigit = hexadecimal.charAt(i);

            // Convert hex character to decimal value
            int decimalValue;
            if (hexDigit >= '0' && hexDigit <= '9') {
                decimalValue = hexDigit - '0';  // Convert '0'-'9' to 0-9
            } else if (hexDigit >= 'A' && hexDigit <= 'F') {
                decimalValue = hexDigit - 'A' + 10;  // Convert 'A'-'F' to 10-15
            } else if (hexDigit >= 'a' && hexDigit <= 'f') {
                decimalValue = hexDigit - 'a' + 10;  // Convert 'a'-'f' to 10-15
            } else {
                // Invalid hexadecimal character
                System.out.println("Invalid hexadecimal digit: " + hexDigit);
                return -1;  // Return -1 for error
            }

            // Calculate the decimal value and add to the result
            decimal += decimalValue * Math.pow(16, length - 1 - i);
        }

        return decimal;
    }
}
