public class Lab6Quiz {
    public static void main(String[] args) {
        // We will print 5 rows total
        for (int row = 0; row < 5; row++) {
            // For each row, we print 5 characters
            for (int col = 0; col < 5; col++) {
                // Star should appear when row == col
                if (row == col) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            // Move to the next line after finishing one row
            System.out.println();
        }
    }
}
