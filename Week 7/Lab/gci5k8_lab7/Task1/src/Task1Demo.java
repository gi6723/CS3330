
public class Task1Demo {
    public static void main(String[] args) {
        //Creating worker 1
        ProductionWorker workerOne = new ProductionWorker(
                "John Smith", "123-A", "11-15-2005", 1, 16.50
        );

        //Creating worker 2
        ProductionWorker workerTwo = new ProductionWorker(
                "Joan Jones", "222-L", "12-12-2005", 2, 18.50
        );

        // Printing the workers out
        System.out.println(workerOne);
        System.out.println(workerTwo);
    }
}
