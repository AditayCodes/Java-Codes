
//Binary to octal conversion

public class BinaryToOctal {
    public static void main(String[] args) {
        String binary = "110101";  // binary input
        int decimal = Integer.parseInt(binary, 2); // convert binary to decimal
        String octal = Integer.toOctalString(decimal); // convert decimal to octal

        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
    }
}



//Method-2
/*
public class BinaryToOctal {
    public static void main(String[] args) {
        String binary = "110101";

        // Binary to Decimal
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, power);
            power++;
        }

        // Decimal to Octal
        String octal = "";
        int num = decimal;
        while (num > 0) {
            int remainder = num % 8;
            octal = remainder + octal;
            num /= 8;
        }

        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
    }
}

 */