public class Parallelogram extends Shape {
    //Declaring class attributes
    private double base;
    private double height;

    //Class constructor
    public Parallelogram(double b, double h) {
        this.base = b;
        this.height = h;
    }

    //Calculates area of parallelogram
    @Override
    public double getArea() {
        return base * height;
    }

    //Returns string representation of a parallelogram including its area
    @Override
    public String toString() {
        return String.format("I am a parallelogram shape of area: %.2f%n", getArea());
    }
}
