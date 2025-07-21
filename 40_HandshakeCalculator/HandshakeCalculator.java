
//Maximum number of handshakes

import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of people
        System.out.print("Enter the number of people: ");
        int n = sc.nextInt();

        // Calculate maximum number of handshakes
        int handshakes = (n * (n - 1)) / 2;

        System.out.println("Maximum number of handshakes: " + handshakes);

        sc.close();
    }
}
