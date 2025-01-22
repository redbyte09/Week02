package Faculty;

import java.util.ArrayList;
import java.util.List;

// Class to represent a Faculty member
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Class to represent a Department
class Department {
    private String departmentName;
    private List<Faculty> facultyMembers;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            System.out.println("- " + faculty.getName());
        }
    }
}

// Class to represent a University
class University {
    private String universityName;
    private List<Department> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayUniversityDetails() {
        System.out.println("University: " + universityName);
        for (Department department : departments) {
            department.displayDepartmentDetails();
            System.out.println();
        }
    }
}

// Main class to demonstrate the University system
public class Main {
    public static void main(String[] args) {
        // Create faculty members
        Faculty faculty1 = new Faculty("Prof. Sakshi");
        Faculty faculty2 = new Faculty("Prof. Anjani");
        Faculty faculty3 = new Faculty("Dr. Devon");

        // Create departments
        Department csDepartment = new Department("Computer Science");
        csDepartment.addFaculty(faculty1);
        csDepartment.addFaculty(faculty2);

        Department mathDepartment = new Department("Mathematics");
        mathDepartment.addFaculty(faculty3);

        // Create a university and add departments
        University university = new University("Global University");
        university.addDepartment(csDepartment);
        university.addDepartment(mathDepartment);

        // Display university details
        university.displayUniversityDetails();

        // Demonstrating faculty can exist independently
        System.out.println("Independent Faculty: " + faculty1.getName());
    }
}

