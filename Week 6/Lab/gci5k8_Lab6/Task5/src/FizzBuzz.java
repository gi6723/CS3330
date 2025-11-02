import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args){
        //Declaring scanner object
        Scanner scanner = new Scanner(System.in);

        //Taking in user input
        System.out.println("Enter two integers:");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for(int i = start; i <= end; i++){
            if (i % 3 == 0 && i % 5 ==0){
                //if divisible by 3 and 5 we print FizzBuzz
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                //if divisible by 3 only print Fizz
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                //if divisible by 5 only print Buzz
                System.out.println("Buzz");
            } else {
                //if not divisible by 3 or 5 we just print the value of i
                System.out.println(i);
            }
        }

    }
}
