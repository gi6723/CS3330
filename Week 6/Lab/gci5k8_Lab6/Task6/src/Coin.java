import java.util.Random;
public class Coin {
    //Declaring class attributes
    private String sideUp;

    //Default constructor calls toss()
    public Coin(){
        toss();
    }

    /*
     * Method to simulate a coint toss
     * 0 --> heads
     * 1 --> tails
     */
    public void toss(){
        Random range = new Random();
        int r = range.nextInt(2); // 0 or 1
        sideUp = (r == 0) ? "heads" : "tails";
    }

    //Returns the side currently facing up
    public String getSideUp(){
        return sideUp;
    }
}
