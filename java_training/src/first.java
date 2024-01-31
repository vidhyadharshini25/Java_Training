import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int a, b,sum, c, out ;
        System.out.println("Enter values for a and b:");
        a = 20;
        b = 10;
        sum = (a + b)/2;
        c = 5;
                out = sum*c;
        System.out.println("Output is " + out);
        double base = 10;
        double height = 20;


        double area = 0.5 * base * height;


        System.out.println("The area of the triangle is: " + area);

    }
}
