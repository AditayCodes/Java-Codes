
//Decimal to binary conversion

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 25;
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary of " + decimal + " is " + binary);
    }
}


//Method-2
/* 
public class DecimalToBinaryManual {
    public static void main(String[] args) {
        int decimal = 25;
        String binary = "";

        int num = decimal;
        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary; // prepend remainder
            num = num / 2;
        }

        System.out.println("Binary of " + decimal + " is " + binary);
    }
}
*/