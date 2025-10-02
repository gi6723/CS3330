// import java scanner class
import java.util.Scanner;

public class OutputDigits {
    /*
     * The objective of this program is to take in a two digit integer from the user
     * Then we are going to display the digits of that integer in reverse order
     * separated by the string "<->".
     */
    public static void main(String[] args){
        // defining scanner object
        Scanner scanner = new Scanner(System.in);

        //Prompt user for input
        System.out.print("Please enter a two digit integer: ");
        int d = scanner.nextInt(); // reads an integer value from standard input

        //Extracting the first digit from the integer entered by the user
        int firstDigit = d / 10;

        int secondDigit = d % 10; //Extracting the second digit from the integer entered by the user

        //Printing the digits of the number the user entered
        System.out.println(secondDigit + "<->" + firstDigit);

    }
}
