public class Trapezoid extends Shape {

    //Declaring class attributes
    private double lowerBase;
    private double upperBase;
    private double height;

    //Trapezoid class constructor
    public Trapezoid(double b1, double b2, double h) {
        this.lowerBase = b1;
        this.upperBase = b2;
        this.height = h;
    }

    //Computes area of trapezoid
    @Override
    public double getArea() {
        return 0.5 * (lowerBase + upperBase) * height;
    }

    //Returns string representation of a trapezoid including its area
    @Override
    public String toString() {
        return String.format("I am a trapezoid shape of area: %.2f%n", getArea());
    }
}
