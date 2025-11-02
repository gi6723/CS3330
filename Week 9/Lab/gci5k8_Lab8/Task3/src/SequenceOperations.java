public class SequenceOperations {
    /*
     * Calculates the total (sum) of all values in the given array.
     *
     * @param arr the array of double values
     * @return the total sum of all values
     */
    public static double getTotal(double[] arr){
        // Variable to store sum
        double total = 0.0;

        // Loop through each element and add it to the total
        for(int i = 0; i <= arr.length - 1; i++){
            total += arr[i];
        }
        return total;
    }

    /*
     * Calculates the average (mean) value of the given array.
     *
     * @param arr the array of double values
     * @return the average of all values in the array
     */
    public static double getAverage(double[] arr){
        return getTotal(arr) / arr.length;
    }

    /*
     * Finds and returns the highest value in the array.
     *
     * @param arr the array of double values
     * @return the largest number in the array
     */
    public static double getHighest(double[] arr){
        double high = arr[0];

        //Compare each element to find the maximum value
        for(int i = 0; i <= arr.length - 1; i++){
            if (arr[i] > high){
                high = arr[i];
            }
        }
        return high;
    }

    /*
     * Creates and returns a new array containing the elements of
     * the given array in reverse order.
     *
     * @param arr the array of double values
     * @return a new array with elements in reverse order
     */
    public static double[] getReverse(double[] arr){
        //Initializing empty array to store reverse order to
        double[] reverseOrder = new double[arr.length];

        // Copy elements from the end of the original array to the start of the new array
        for(int revIndex = 0, arrIndex = arr.length - 1; revIndex < arr.length; revIndex++, arrIndex--){
            reverseOrder[revIndex] = arr[arrIndex];
        }
        return reverseOrder;
    }
}
