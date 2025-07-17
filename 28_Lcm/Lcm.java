
//LCM of two numbers

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 =sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int hcf = a;

        int lcm = (num1 * num2) / hcf;

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close();
    }
}
