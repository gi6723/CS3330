public class MagicDate {
    //Initilizing class attributes
    private int month, day, year;

    //Declaring class constructor
    public MagicDate(int m, int d, int y){
        this.month = m;
        this.day = d;
        this.year = y;
    }


    public boolean isMagic(){
        // Returns true if month multiplied by day equals year
        return month * day == year;
    }
}
