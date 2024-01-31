import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput1 = scanner.nextInt();
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        while (userInput1 > 0) {
            int digit = userInput1 % 10;
//            System.out.println(digit);
            System.out.println(digit + "-" + word[digit]);
            userInput1 /= 10;
        }
//        int factorial = 1;
//        for (int i = 1; i <= userInput1; i++) {
//            factorial *= i;
//        }
//
//
//        System.out.println("Factorial of " + userInput1 + " is: " + factorial);

//        int sum = 0;
//
//        for (int i = userInput1; i >= 1; i--) {
//            sum += i;
//        }
//
//        System.out.println("Sum of numbers from " + userInput1 + " down to 1 is: " + sum);
    }
}
