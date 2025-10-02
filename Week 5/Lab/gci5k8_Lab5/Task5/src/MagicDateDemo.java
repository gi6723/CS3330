import java.util.Scanner;

public class MagicDateDemo {
    public static void main (String[] args){
        //Initializing variables to take in user input for month, day, and year
        int month, day, year;
        //Initializing varible to store bool value from isMagic method
        boolean bool;

        //Declaring scanner object
        Scanner scanner = new Scanner(System.in);

        //Prompting user to enter int value for month
        System.out.print("Please enter an integer value for the month: ");
        month = scanner.nextInt(); //storing input to month varible

        //Prompting user to enter int value for day
        System.out.print("Please enter an integer value for the day: ");
        day = scanner.nextInt(); //storing input to day varible

        //Prompting user to enter int value for year
        System.out.print("Please enter a two-digit year (e.g., 06): ");
        year = scanner.nextInt(); //storing input to year varible

        //Creating instance of MagicDate class
        MagicDate date = new MagicDate(month, day, year);

        //Calling isMagic on passed in values and stores returned bool to bool variable
        bool = date.isMagic();

        /*
         * when bool is true:
         * print out the date the user entered in and tell them it's magic
         * when bool is false:
         * print out the date the user entered in and tell them it's NOT magic
         */
        if (bool){
            System.out.printf("The date %d/%d/%d is magic.", month, day, year);
        }else{
            System.out.printf("The date %d/%d/%d is NOT magic.", month, day, year);
        }
    }
}
