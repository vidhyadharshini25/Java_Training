import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of side 'a': ");
    double a = sc.nextDouble();

        System.out.print("Enter the length of side 'b': ");
    double b = sc.nextDouble();

        System.out.print("Enter the length of side 'c': ");
    double c = sc.nextDouble();

    // Calculate 's'
    double s = (a + b + c) / 2;


    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        char d = 'z';
        d++;

        System.out.println("The area of the triangle is: " + d);
    }

}
