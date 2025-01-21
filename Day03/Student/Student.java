package Student;

public class Student {
    // Static variable shared across all students
    private static String universityName = "Global University";
    
    // Static variable to keep track of total students
    private static int totalStudents = 0;
    
    // Final variable for roll number to ensure it cannot be changed once assigned
    private final int rollNumber;
    
    // Instance variables for student details
    private String name;
    private char grade;
    
    // Constructor using 'this' to initialize name, rollNumber, and grade
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increment total students when a new student is added
    }
    
    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    public char getGrade() {
        return grade;
    }
    
    // Setter method to update the grade
    public void updateGrade(char newGrade) {
        this.grade = newGrade;
    }
    
    // Method to display student details if the object is an instance of Student
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Student Name: " + this.getName());
            System.out.println("Roll Number: " + this.getRollNumber());
            System.out.println("Grade: " + this.getGrade());
        } else {
            System.out.println("This object is not an instance of Student class.");
        }
    }
    
    public static void main(String[] args) {
        // Creating instances of Student
        Student student1 = new Student("Alice", 101, 'A');
        Student student2 = new Student("Bob", 102, 'B');
        
        // Displaying student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        
        // Updating grade for student1
        student1.updateGrade('A');
        student1.displayStudentDetails();
        
        // Displaying the total number of students
        Student.displayTotalStudents();
    }
}
