package Employee;

// Parent class
public class Employee {
    // Public member
    public String employeeID;

    // Protected member
    protected String department;

    // Private member
    private double salary;

    // Constructor
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to set the salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass
class Manager extends Employee {
    private String team;

    // Constructor
    public Manager(String employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID); // Access public member
        System.out.println("Department: " + department);  // Access protected member
        System.out.println("Team: " + team);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("E12345", "Engineering", 75000);
        employee.displayEmployeeDetails();

        // Modify and access the salary using public methods
        employee.setSalary(80000);
        System.out.println("Updated Salary: $" + employee.getSalary());

        // Create a Manager object
        Manager manager = new Manager("M67890", "HR", 95000, "Recruitment");
        manager.displayManagerDetails();
    }
}
