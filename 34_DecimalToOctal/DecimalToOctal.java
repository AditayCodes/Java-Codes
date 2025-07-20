
//Decimal to octal conversion

public class DecimalToOctal {
    public static void main(String[] args) {
        int decimal = 83;
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal of " + decimal + " is " + octal);
    }
}


//Method-2
/* 
public class DecimalToOctal {
    public static void main(String[] args) {
        int decimal = 83;
        String octal = "";

        int num = decimal;
        while (num > 0) {
            int remainder = num % 8;
            octal = remainder + octal; // prepend remainder
            num = num / 8;
        }

        System.out.println("Octal of " + decimal + " is " + octal);
    }
}
*/