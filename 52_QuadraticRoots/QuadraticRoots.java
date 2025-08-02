// Finding Roots of a quadratic equation

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Calculate discriminant
        double d = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
        } else if (d > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Two real and distinct roots:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (d == 0) {
            // One real root (repeated)
            double root = -b / (2 * a);
            System.out.println("Two real and equal roots:");
            System.out.println("Root = " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Complex roots:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }

        sc.close();
    }
}
