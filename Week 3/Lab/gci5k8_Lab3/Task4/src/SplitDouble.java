//importing java scanner class
import java.util.Scanner;
public class SplitDouble {
    /*
    * The objective of this program is to take in a double value from the user
    * Then we are going to display the whole and fractional parts of that double value
    * on two separate lines.
     */
    public static void main(String[] args){
        //Defining a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        //Prompting user to enter a double value
        System.out.print("Please enter a double value: ");
        double userInput = scanner.nextDouble(); //Reading double value from user

        //Extracting whole and fractional parts
        int wholePart = (int) userInput; //Casting double to int to get whole

        //Extracting fractional part
        double fractionalPart = userInput - wholePart; //Subtracting whole part from original value

        //Displaying the results on two separate lines
        System.out.println((double) wholePart);
        System.out.println(fractionalPart);


    }
}
