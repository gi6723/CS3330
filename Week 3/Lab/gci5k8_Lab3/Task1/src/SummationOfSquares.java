//importing Java Scanner class
import java.util.Scanner;

public class SummationOfSquares {
    /*
     * The objective of this program is to take in two integer values from the user
     * Then we are going to display the summation of their squares
     */
    public static void main(String[] args) {
        //Defining Scanner object
        Scanner scanner = new Scanner(System.in);

        //Prompting user for input
        System.out.print("Please enter the first integer: ");
        int a = scanner.nextInt(); // it reads an integer value from the standard input

        System.out.print("Please enter the second integer: ");
        int b = scanner.nextInt(); // it reads another integer value from the standard input

        System.out.println(a * a + b * b); // it writes the result of a + b in the standard output
    }
}
