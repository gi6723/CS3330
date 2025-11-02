public class RoomCarpet {
    //Declaring class attributes
    private final RoomDimension size;
    private double carpetCost;

    //Constructor
    public RoomCarpet(RoomDimension dim, double cost){
        this.size = dim;
        this.carpetCost = cost;
    }

    // --- Methods ---
    public double getTotalCost(){
        /*
         * Calculates the total cost of carpeting the room
         * Multiplies the room's area (retrieved from the RoomDimension object stores in 'size')
         * by the carpet cost per square foot
         */
        return size.getArea() * carpetCost;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Carpet cost: $").append(getTotalCost());
        return sb.toString();
    }
}
