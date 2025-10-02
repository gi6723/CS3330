import java.util.Scanner;
public class Lab5Quiz {
    public static void main(String[] args){
        //Declaring varibles to store the two entered integer values and their sum
        int val1, val2, sum;

        //Declaring scanner object
        Scanner scanner = new Scanner(System.in);

        //Prompting user to enter two integer values
        System.out.print("Enter two integer values: ");

        //Storing entered values to respective variables
        val1 = scanner.nextInt();
        val2 = scanner.nextInt();

        //Calculating the sum of the two entered integers
        sum = val1 + val2;

        //If sum 10..19 inclusive print 20, else print the sum
        if(sum >= 10 && sum <= 19){
            System.out.println(20);
        } else {
            System.out.println(sum);
        }
    }
}
