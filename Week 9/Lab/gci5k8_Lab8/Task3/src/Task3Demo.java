import java.util.Arrays;
public class Task3Demo {
    public static void main(String[] args){

        double[] array = {3.0, 2.4, 6.0, 2.0, 4.0, 5.1, 7.2};

        System.out.println("Processing the array: " + Arrays.toString(array));
        System.out.println("Total: " + SequenceOperations.getTotal(array));
        System.out.printf("Average: %.2f \n", SequenceOperations.getAverage(array));
        System.out.println("Highest Value: " + SequenceOperations.getHighest(array));
        System.out.println("Array Reverse: " + Arrays.toString(SequenceOperations.getReverse(array)));
    }
}
