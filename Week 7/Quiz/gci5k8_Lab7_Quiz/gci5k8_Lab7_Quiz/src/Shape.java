public abstract class Shape {
    // Abstract method to compute the area; must be implemented by subclasses.
    public abstract double getArea();

    //Returns a string representation of a shape including its area
    @Override
    public String toString() {
        return String.format("Shape of area: %.2f%n", getArea());
    }
}
