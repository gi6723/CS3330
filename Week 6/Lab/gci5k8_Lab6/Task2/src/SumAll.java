import java.util.Scanner;
public class SumAll {
    public static void main(String[] args){

        //Variable declarations
        int userInput;
        int counter = 0;
        int sum = 0;

        //Initializing scanner object
        Scanner scanner = new Scanner(System.in);

        //Asking user to enter int value then storing it to userInput variable
        System.out.print("Enter a positive nonzero integer value: ");
        userInput = scanner.nextInt();

        //Do-while loop to sum from 1 to userInput
        do{
           if (userInput <= 0){
               break;
           }
           sum += counter;
           counter ++;
        }while (counter <= userInput);

        //Printing result
        System.out.print(sum);
    }
}
