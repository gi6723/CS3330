public class RankSwitchVersion {
    private double m;

    public RankSwitchVersion (double mark){
        this.m = mark;
    }

    /*
     * The getRank() method determines the rank category based on the mark.
     * It divides the value for mark by 10 and casts the result to int (e.g., 89.9 / 10 = 8.99, cast to int = 8).
     * Casting truncates the decimal part, leaving only the whole number.
     * This allows us to isolate the ten's digit.
     * Since grading categories are grouped in blocks of 10, the tens digit
     * directly maps to the appropriate range for ranking.
     */
    public String getRank(){
        int val = (int) (m / 10);

        switch (val){
            case 10:
            case 9:
                return "Exceeds Expectations";
            case 8:
            case 7:
                return "Meets Expectations";
            case 6:
            case 5:
                return "Below Expectations";
            default:
                return "Unacceptable";
        }
    }
}
