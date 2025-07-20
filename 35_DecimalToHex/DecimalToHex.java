
//Decimal to Hexadecimal Conversion

public class DecimalToHex {
    public static void main(String[] args) {
        int decimal = 255;
        String hex = Integer.toHexString(decimal);
        System.out.println("Hexadecimal of " + decimal + " is " + hex.toUpperCase());
    }
}



//Method-2
/*
public class DecimalToHex {
    public static void main(String[] args) {
        int decimal = 255;
        String hex = "";

        char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9',
                            'A','B','C','D','E','F'};
        int num = decimal;
        while (num > 0) {
            int remainder = num % 16;
            hex = hexDigits[remainder] + hex; // prepend hex digit
            num = num / 16;
        }

        System.out.println("Hexadecimal of " + decimal + " is " + hex);
    }
}
 
 */