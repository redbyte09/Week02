package Student;

// Parent class
public class Student {
    // Public member
    public int rollNumber;

    // Protected member
    protected String name;

    // Private member
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value. It must be between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass
class PostgraduateStudent extends Student {
    private String thesisTitle;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA);
        this.thesisTitle = thesisTitle;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        displayStudentDetails(); // Call method from parent class
        System.out.println("Thesis Title: " + thesisTitle);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(101, "John Doe", 8.5);
        student.displayStudentDetails();

        // Modify and access CGPA using public methods
        student.setCGPA(9.0);
        System.out.println("Updated CGPA: " + student.getCGPA());

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Jane Smith", 9.2, "AI in Healthcare");
        pgStudent.displayPostgraduateDetails();
    }
}

