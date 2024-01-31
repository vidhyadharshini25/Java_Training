import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        int abc = 1;
//        while (ab <= 5) {
//            System.out.println("Count: " + ab);
//            ab++;
//        }
//        do {
//            System.out.println(ab);
//            ab++;
//        }
//        while (ab < 5);
//        for (int ab = 0; ab < 5; ab++) {
//            System.out.println(ab);
//        }
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int userInput1 = scanner.nextInt();





        for (int i = 1; i <= 10; i++) {
            int result = userInput1 * i;

            System.out.println( result );
        }



        // Close the scanner
        scanner.close();
    }
}
