import java.util.Scanner;

public class SphereDemo {
    public static void main(String[] args) {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the radius
        System.out.print("Enter the radius of the sphere: ");
        double r = scanner.nextDouble();

        // Create a sphere object
        Sphere sphere = new Sphere(r);

        // Display results
        System.out.println("The sphere's volume is " + sphere.getVolume());
        System.out.println("The sphere's surface is " + sphere.getSurface());
    }
}
