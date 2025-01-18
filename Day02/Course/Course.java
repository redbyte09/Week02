package Course;

public class Course {
    // Instance variables
    private String courseName;
    private int duration; // Duration in weeks or months
    private double fee;

    // Class variable
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating course instances
        Course course1 = new Course("Java Programming", 12, 500.00);
        Course course2 = new Course("Data Science", 24, 1500.00);

        // Displaying course details before updating institute name
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Updating institute name
        Course.updateInstituteName("Tech Academy");

        // Displaying course details after updating institute name
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
