// importing Java Scanner class
import java.util.Scanner;

public class ComputeExpression {
    /*
     * The objective of this program is to take in an integer value from the user
     * The program will compute the value of the expression ((n + 1) * n + 2) * n + 3
     * where n is the integer value entered by the user
     * and display the result
     */
    public static void main(String[] args){
        // creating scanner object
        Scanner scanner = new Scanner(System.in);

        //prompt user to enter integer value
        System.out.print("Please enter an integer value: ");
        int n = scanner.nextInt(); // reads an integer from standard input

        // computing the expression and displaying the result
        System.out.println (((n + 1) * n + 2) * n + 3);
    }
}
