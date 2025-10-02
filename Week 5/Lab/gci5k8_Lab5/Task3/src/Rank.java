public class Rank {
    //Declaring attribute to store student's exam mark
    private double m;

    // Constructor for the Rank class
    public Rank (double mark){
        this.m = mark;
    }

    public String getRank(){
        if (m >= 90){
            return "Exceeds Expectations";
        }
        else if ( m >= 70 && m < 90) {
            return "Meets Expectations";
        }
        else if (m >= 50 && m < 70) {
            return "Below Expectations";
        } else {
            return "Unacceptable";
        }
    }

}
