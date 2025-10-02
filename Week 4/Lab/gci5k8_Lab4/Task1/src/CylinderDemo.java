import java.util.Scanner;

public class CylinderDemo {
    public static void main(String[] args) {
        //Initlizing Scanner object
        Scanner scanner = new Scanner(System.in);

        //Taking user input for radius and height
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        //Creating Cylinder object
        Cylinder cylinder = new Cylinder(radius, height);

        //Displauying the entered values for radius and height
        System.out.println("The cylinder's radius is: " + cylinder.getRadius());
        System.out.println("The cylinders height is: " + cylinder.getHeight());

        //Displaying the calculated values for volume, curved surface area and total surface area
        System.out.println("The cylinder's volume is: "+ cylinder.getVolume());
        System.out.println("The cylinder's curved surface area is: " + cylinder.getCurvedSurfaceArea());
        System.out.println("The cylinder's total surface area is: " + cylinder.getTotalSurfaceArea());
    }
}
