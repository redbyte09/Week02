package Employee;

// Abstract class Employee
abstract class Employee {

    // Properties of Employee
    String employeeId; // Unique ID of the employee
    String name;       // Name of the employee
    int baseSalary;    // Base salary of the employee

    // Constructor to initialize employee details
    public Employee(String employeeId, String name, int baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method to calculate salary (implementation will vary for different employee types)
    abstract void calculateSalary();

    // Method to display common employee details
    public void displayDetails() {
        System.out.println("The Employee ID is: " + employeeId);
        System.out.println("The name of the employee is: " + name);
    }
}

// Interface Department
interface Department {

    // Assign the department to the employee
    void assignDepartment();

    // Get details about the assigned department
    void getDepartmentDetails();
}

// FullTimeEmployee class (inherits Employee and implements Department interface)
class FullTimeEmployee extends Employee implements Department {

    // Constructor to initialize full-time employee details
    public FullTimeEmployee(String employeeId, String name, int baseSalary) {
        super(employeeId, name, baseSalary); // Call the parent class constructor
    }

    // Calculate salary for full-time employees (fixed salary in this case)
    @Override
    public void calculateSalary() {
        System.out.println("The salary is: " + baseSalary);
    }

    // Assign a department to the full-time employee
    @Override
    public void assignDepartment() {
        System.out.println("The department is: Testing bugs");
    }

    // Provide details about the full-time employee's department
    @Override
    public void getDepartmentDetails() {
        System.out.println("The department is working properly.");
    }
}

// PartTimeEmployee class (inherits Employee and implements Department interface)
class PartTimeEmployee extends Employee implements Department {

    // Constructor to initialize part-time employee details
    public PartTimeEmployee(String employeeId, String name, int baseSalary) {
        super(employeeId, name, baseSalary); // Call the parent class constructor
    }

    // Calculate salary for part-time employees (hourly wages or similar logic can be applied here)
    @Override
    public void calculateSalary() {
        System.out.println("The salary is: " + baseSalary);
    }

    // Assign a department to the part-time employee
    @Override
    public void assignDepartment() {
        System.out.println("The department is: Cleaning");
    }

    // Provide details about the part-time employee's department
    @Override
    public void getDepartmentDetails() {
        System.out.println("The department is not working properly.");
    }
}

// Main class containing the entry point (main method)
public class Main {
    public static void main(String[] args) {
        // Create an instance of FullTimeEmployee
        FullTimeEmployee fte = new FullTimeEmployee("Abcd123456789", "Adarsh Gupta", 900000);

        // Display details of the full-time employee
        fte.calculateSalary(); // Calculate and display salary
        fte.assignDepartment(); // Assign a department
        fte.getDepartmentDetails(); // Get department details
        fte.displayDetails(); // Display employee details
        System.out.println("-------------");

        // Create an instance of PartTimeEmployee
        PartTimeEmployee pte = new PartTimeEmployee("Abcde12345234", "Unaiz Bhoot", 50000);

        // Display details of the part-time employee
        pte.calculateSalary(); // Calculate and display salary
        pte.assignDepartment(); // Assign a department
        pte.getDepartmentDetails(); // Get department details
        pte.displayDetails(); // Display employee details
        System.out.println("-------------");
    }
}
