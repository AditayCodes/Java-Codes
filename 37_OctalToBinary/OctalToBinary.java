
//Octal to binary conversion

public class OctalToBinary {
    public static void main(String[] args) {
        String octal = "17";  // Octal input
        int decimal = Integer.parseInt(octal, 8); // Octal to Decimal
        String binary = Integer.toBinaryString(decimal); // Decimal to Binary

        System.out.println("Octal: " + octal);
        System.out.println("Binary: " + binary);
    }
}



//Method-2
/*
public class OctalToBinary {
    public static void main(String[] args) {
        String octal = "17";
        StringBuilder binary = new StringBuilder();

        for (int i = 0; i < octal.length(); i++) {
            char digit = octal.charAt(i);
            int value = digit - '0';

            // Convert each octal digit to 3-bit binary and pad with 0s if needed
            String bin = Integer.toBinaryString(value);
            while (bin.length() < 3) {
                bin = "0" + bin;
            }

            binary.append(bin);
        }

        // Remove leading zeros if any
        String finalBinary = binary.toString().replaceFirst("^0+(?!$)", "");

        System.out.println("Octal: " + octal);
        System.out.println("Binary: " + finalBinary);
    }
}
 */