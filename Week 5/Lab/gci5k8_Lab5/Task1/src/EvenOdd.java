import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        //Declaring a variable to store user input and remainder from even/odd calculation
        int input, remainder;

        //Initializing Scanner object
        Scanner scanner = new Scanner(System.in);

        //Grabbing user input
        System.out.print("Please enter a integer: ");
        input = scanner.nextInt(); //stores the entered int value into input varible

        /*
         * By dividing the users input by with the modulus operator "%" 2
         * If remainder = 0 we know the number is even
         * Else if remainder anything either than 0 we know its odd
         */
        remainder = input % 2;

        if (remainder == 0) {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
    }
}
