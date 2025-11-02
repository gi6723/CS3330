
public class ProductionWorker extends Employee {

    //
     //Tracks the total number of ProductionWorker instances created
    private static int createdCount = 0;

    //The creation order of this ProductionWorker instance
    private final int instanceOrder;

    //1 for day shift, 2 for night shift
    private int shift;

    //Hourly pay rate for this worker
    private double hourlyPayRate;

    // --- constructors ---
    // Default constructor for ProductionWorker initializes a ProductionWorker with default values and tracks instance order
    public ProductionWorker() {
        super();
        createdCount++;
        this.instanceOrder = createdCount;
    }

    //Constructor with parameters
    public ProductionWorker(String name, String employeeNumber, String hireDate,
                            int shift, double hourlyPayRate) {
        super(name, employeeNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
        createdCount++;
        this.instanceOrder = createdCount;
    }

    //Getters and Setters
    public int getShift() {
        return shift;
    }
    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }
    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    // Helpers
    private String shiftLabel() {
        return (shift == 1) ? "Day" : "Night";
    }

    private String ordinalHeader() {
        if (instanceOrder == 1) return "The first production worker.";
        if (instanceOrder == 2) return "The second production worker.";
        // Fallback if more are created
        if (instanceOrder == 3) return "The third production worker.";
        return "Production worker #" + instanceOrder + ".";
    }

    // Returns a formatted string representation of the ProductionWorker, including order, inherited fields, shift, and pay rate
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ordinalHeader()).append("\n");
        sb.append(super.toString()); // Name, Employee Number, Hire Date (already newline-terminated)
        sb.append("Shift: ").append(shiftLabel()).append("\n");
        sb.append(String.format("Hourly Pay Rate: $%.2f", hourlyPayRate));
        // Ensure a blank line after the FIRST worker only (matches sample formatting)
        if (instanceOrder == 1) sb.append("\n");
        return sb.toString();
    }
}
