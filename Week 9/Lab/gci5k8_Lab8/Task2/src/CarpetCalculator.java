import java.util.Scanner;
public class CarpetCalculator {
    public static void main(String[] args){
        //Creating Scanner object
        Scanner s = new Scanner(System.in);

        //Asking user to enter price per square foot of chosen carpet
        System.out.print("Enter the price per square foot: ");
        double pricePerSquareFoot = s.nextDouble();

        //Asking user for length of room
        System.out.print("Enter the length of the room: ");
        double roomLength = s.nextDouble();

        //Asking user for width of room
        System.out.print("Now enter the width of the room: ");
        double roomWidth = s.nextDouble();

        RoomDimension room = new RoomDimension(roomLength, roomWidth);
        System.out.println(room.toString());

        RoomCarpet cost = new RoomCarpet(room, pricePerSquareFoot);
        System.out.println(cost.toString());

        s.close();

    }
}
