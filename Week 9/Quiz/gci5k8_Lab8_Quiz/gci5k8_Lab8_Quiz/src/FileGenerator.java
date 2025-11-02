import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;
import java.util.Random;
public class FileGenerator {
    public static void main(String[] args) throws IOException{
        // Creating random object
        Random rand = new Random();

        // Creating numbers.txt
        try (PrintWriter pw = new PrintWriter("numbers.txt")) {
            // For loop to generate 10 random int from 10..150 inclusive and writing the random int to numbers.txt
            for (int i =0; i < 10; i++){
                int randomNumber = rand.nextInt((150 - 10) + 1) + 10;
                pw.println(randomNumber);
            }
        }

        //Creating file object of the file we just created
        File f = new File("numbers.txt");

        //Displaying file contents + calculating sum of files contents
        int sum = 0, count = 0;
        try (Scanner fileReader = new Scanner(f)){
            while(fileReader.hasNextInt()){
                int n = fileReader.nextInt(); //Store read int value
                sum += n; // Adding read value to sum
                count ++; //Incrementing count
                System.out.println(n); // Printing each line we read
            }
        }

        double average = (double) sum / count; // Calculating avg.
        System.out.printf("Average: %.2f%n", average); //Displaying avg.
    }
}
