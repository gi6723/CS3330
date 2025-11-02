import java.util.Scanner;
public class PrintSquares {
    public static void main(String[] args){
        //Create scanner object
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        //Input validation
        if (userInput <= 0){
            System.out.println("Invalid input.");
            return;
        }

        // Variable to store current natural number
        int i = 1;
        boolean first = true; // to handle comma formatting

        // Loop until the square exceeds N
        while (i * i <= userInput) {
            if (first) {
                System.out.print(i * i); // print the first square without a leading comma
                first = false;
            } else {
                System.out.print(", " + (i * i)); // print remaining squares with commas
            }
            i++; // move to the next number
        }

        System.out.println("."); //adding period to end of output for formatting

    }
}
