import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args) {
        // Initialize Scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking user input for temperature in Fahrenheit
        System.out.print("Enter the Fahrenheit temperature: ");
        double f = scanner.nextDouble();
        // Creating Temperature object
        Temperature temp = new Temperature(f);

        // Displaying the entered Fahrenheit temperature in Celsius and kelvin
        System.out.println("Celsius: " + temp.getCelsius());
        System.out.println("Kelvin: " + temp.getKelvin());
    }
}
