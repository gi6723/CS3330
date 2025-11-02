public class Employee {

    // Declaring class attributes
    private String name;
    private String employeeNumber;
    private String hireDate;

    //Default employee constructor
    public Employee() {

    }

    //Constructor with parameters
    public Employee(String name, String employeeNumber, String hireDate) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    // Class Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    // Returns a string representation of the Employee object with name, employee number, and hire date
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("Employee Number: ").append(employeeNumber).append("\n");
        sb.append("Hire Date: ").append(hireDate).append("\n");
        return sb.toString();
    }
}
