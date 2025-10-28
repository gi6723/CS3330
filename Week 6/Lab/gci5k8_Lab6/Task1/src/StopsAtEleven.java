import java.util.Scanner;
public class StopsAtEven {
    public static void main(String[] args){

        //Initializing variable to store user input and sum of user input's
        int userInput = 0;
        int sum = 0;

        //Initializing scanner object;
        Scanner scanner = new Scanner(System.in);

        /*
         * while user input != 11 or a negative value:
         * sum the integers user given us until they input 11 or a negative value
         */
        while (true){
            userInput = scanner.nextInt();
            if (userInput == 11 || userInput < 0){
                break;
            }
            sum += userInput;
        }
        //Printing out sum to user
        System.out.print(sum);
    }
}
