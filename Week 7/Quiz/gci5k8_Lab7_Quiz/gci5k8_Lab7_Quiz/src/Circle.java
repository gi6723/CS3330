public class Circle extends Shape {
    //Initilizing static final value for PI
    private static final double PI = 3.14159;
    //Declaring class attribute radius
    private double radius;

    //Class constructor for Circle
    public Circle(double r) {
        this.radius = r;
    }

   //Calculates and returns area of the cirle
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    //Returns string representation of a circle including its area
    @Override
    public String toString() {
        return String.format("I am a circle shape of area: %.2f%n", getArea());
    }
}
