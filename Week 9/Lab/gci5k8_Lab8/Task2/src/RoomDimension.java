public class RoomDimension {
    //Declaring class attributes
    private final double length;
    private final double width;

    //Constructor
    public RoomDimension(double len, double w){
        this.length = len;
        this.width = w;
    }

    // --- Methods ---

    //Method that returns the area
    public double getArea(){
        return length * width;
    }

    //toString method
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Room dimensions: ").append("\n")
                .append("Length: ").append(length)
                .append(" Width: ").append(width)
                .append(" Area: ").append(getArea());
        return sb.toString();
    }
}
