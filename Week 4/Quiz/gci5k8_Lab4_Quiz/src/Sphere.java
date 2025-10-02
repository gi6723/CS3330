public class Sphere {
    // Constant for PI
    private final double PI = 3.14159;

    // Field for radius
    private double radius;

    // Constructor fo sphere
    public Sphere(double r) {

        radius = r;
    }

    // Setter for radius
    public void setRadius(double r) {

        radius = r;
    }

    // Getter for radius
    public double getRadius() {

        return radius;
    }

    // Method to calculate volume
    public double getVolume() {
        // Volume of a sphere = (4/3) * PI * r^3
        return (3.0 / 4.0) * PI * radius * radius * radius;
    }

    // Method to calculate surface area
    public double getSurface() {
        // Surface of a sphere = 4 * PI * r^2
        return 4 * PI * radius * radius;
    }
}
