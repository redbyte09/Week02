package Employee;

public class Employee {
    // Static variable shared across all employees
    private static String companyName = "Cooling Ours";
    
    // Static variable to keep track of the total number of employees
    private static int totalEmployees = 0;
    
    // Final variable for employee ID to ensure it cannot be changed once assigned
    private final int id;
    
    // Instance variables for employee name and designation
    private String name;
    private String designation;
    
    // Constructor to initialize name, id, and designation using 'this'
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Increment total employees when a new employee is added
    }
    
    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getDesignation() {
        return designation;
    }
    
    // Method to display employee details if the object is an instance of Employee
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee Name: " + this.getName());
            System.out.println("Employee ID: " + this.getId());
            System.out.println("Employee Designation: " + this.getDesignation());
        } else {
            System.out.println("This object is not an instance of Employee class.");
        }
    }
    
    public static void main(String[] args) {
        // Creating instances of Employee
        Employee employee1 = new Employee("Alice", 101, "Manager");
        Employee employee2 = new Employee("Bob", 102, "Developer");
        
        // Displaying employee details
        employee1.displayEmployeeDetails();
        employee2.displayEmployeeDetails();
        
        // Displaying the total number of employees
        Employee.displayTotalEmployees();
    }
}
