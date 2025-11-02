import java.util.Scanner;
public class SumA2B {
    public static void main(String[] args){
        //Declaring scanner object
        Scanner scanner = new Scanner(System.in);

        //Requesting user input for A & B, then storing the values
        System.out.print("Enter int for A: ");
        int a = scanner.nextInt();
        System.out.print("Enter int for B: ");
        int b = scanner.nextInt();

        //declaring varible to store sum
        int sum = 0;
        //Usring a for loop to add all int's from a to b (inclusive)
        for(int i = a; i <= b; i++ ){
            sum += i;
        }

        System.out.print(sum);
    }
}
