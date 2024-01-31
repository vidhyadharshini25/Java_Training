import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter coefficient A: ");
        double A = scanner.nextDouble();

        System.out.print("Enter coefficient B: ");
        double B = scanner.nextDouble();

        System.out.print("Enter coefficient C: ");
        double C = scanner.nextDouble();


        double discriminant = B * B - 4 * A * C;


        if (discriminant > 0) {

            double root1 = (-B + Math.sqrt(discriminant)) / (2 * A);
            double root2 = (-B - Math.sqrt(discriminant)) / (2 * A);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {

            double root = -B / (2 * A);
            System.out.println("Double Root: " + root);
        } else {

            double realPart = -B / (2 * A);
            double imaginaryPart = Math.sqrt(Math.abs(discriminant)) / (2 * A);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }


    }
}
