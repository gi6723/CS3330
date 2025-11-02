import java.util.Scanner;
public class StopsAtEleven {
    public static void main(String[] args){

        //Initializing variable to store user input and sum of user input's
        int userInput = 0;
        int count = 0;

        //Initializing scanner object;
        Scanner scanner = new Scanner(System.in);


        while (true){
            userInput = scanner.nextInt();

            //Stops reading when 11 is entered
            if (userInput == 11){
                break;
            }

            //Count only non-negative numbers
            if (userInput >= 0){
                count++; //increment counter
            }
        }

        //Printing total count
        System.out.print(count);
    }
}
