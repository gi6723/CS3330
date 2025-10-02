//importing java scanner class
import java.util.Scanner;
public class FeetToMeters {
    /*
    *The purpose of this program is to take in a value in feet that the user enters
    * then convert it to meters.
    *1 foot = 0.305 meters
     */
    public static void main(String[] args) {
        //defining a scanner object
        Scanner input = new Scanner(System.in);

        //prompting user for input
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        //converting user input from feet to meters
        double meters = feet * 0.305;

        //displaying the result to the user
        System.out.println(feet + " feet is " + meters + " meters.");
    }
}
