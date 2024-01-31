import java.util.Scanner;
public class BitWise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter a number: ");
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
//        String result = (number % 2 == 0) ? "even" : "odd";
//        System.out.println(number + " is " + result + ".");

        System.out.print("1 mark: ");
        int m1 = scanner.nextInt();

        System.out.print("2 mark: ");
        int m2 = scanner.nextInt();

        System.out.print("3 mark: ");
        int m3 = scanner.nextInt();

        double average = (m1 + m2 + m3) / 3.0;

        char grade = 'E'; // Default grade

        if (average >= 70) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        }

        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

    }}
