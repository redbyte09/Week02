package Employee;

import java.util.ArrayList;

// Class to represent an Employee
class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
}

// Class to represent a Department
class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Department: " + name);
        for (Employee employee : employees) {
            System.out.println("Employee Name: " + employee.getName() + ", Position: " + employee.getPosition());
        }
    }
}

// Class to represent a Company
class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayCompanyStructure() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayEmployees();
        }
    }
}

// Main class to demonstrate the relationship
public class Main {
    public static void main(String[] args) {
        // Create a Company
        Company company = new Company("TechCorp");

        // Create Departments
        Department department1 = new Department("IT");
        Department department2 = new Department("HR");

        // Create Employees
        Employee employee1 = new Employee("Sakshi", "Developer");
        Employee employee2 = new Employee("Pranjal", "Tester");
        Employee employee3 = new Employee("Chahat", "HR Manager");

        // Add Employees to Departments
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department2.addEmployee(employee3);

        // Add Departments to Company
        company.addDepartment(department1);
        company.addDepartment(department2);

        // Display Company Structure
        company.displayCompanyStructure();

        // Simulate deleting the company (implicitly deletes all departments and employees)
        // In actual application, setting `company` to null and garbage collection would handle the deletion.
        company = null;
    }
}
