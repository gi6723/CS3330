import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] Args){
        // Declaring an integer value to store the year the user enters
        int year;

        //Initializing scanner object
        Scanner scanner = new Scanner(System.in);

        //Prompting user for input
        System.out.print("Please enter a year (e.g., 2004): ");
        year = scanner.nextInt(); //storing int value to year variable

        /*
         * A year is a leap year when:
         * it is divisible by 4 but not 100
         * OR
         * It is divisible by 400
         *
         * A year is NOT a leap year when:
         * It is not divisible by 4
         * OR
         * It is divisible by 100 but not by 400
         */

        if ((year % 4 == 0 && year % 100 !=0 ) || (year % 400 == 0)){
            System.out.println("A LEAP YEAR.");
        }
        else{
            System.out.println("NOT A LEAP YEAR.");
        }
    }
}
