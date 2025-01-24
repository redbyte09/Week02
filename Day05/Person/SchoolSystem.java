package Person;

// Superclass: Person
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display common details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Placeholder method for displaying role (to be overridden by subclasses)
    public void displayRole() {
        System.out.println("Role: General Person");
    }
}

// Subclass: Teacher
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Display role
    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    // Display specific details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Display role
    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    // Display specific details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    private String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Display role
    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }

    // Display specific details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

// Main class to test the hierarchy
public class SchoolSystem {
    public static void main(String[] args) {
        // Create instances of each subclass
        Teacher teacher = new Teacher("Ali", 35, "Mathematics");
        Student student = new Student("Bobby", 16, "11th Grade");
        Staff staff = new Staff("Char", 40, "Administration");

        // Display details for each role
        teacher.displayRole();
        teacher.displayInfo();
        System.out.println();

        student.displayRole();
        student.displayInfo();
        System.out.println();

        staff.displayRole();
        staff.displayInfo();
    }
}

