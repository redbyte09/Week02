package Course;

// Base class: Course
class Course {
    private String courseName;
    private int duration;

    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Display course details
    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass: OnlineCourse (inherits from Course)
class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    // Constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Override displayInfo to include OnlineCourse details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse (inherits from OnlineCourse)
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Calculate the final price after discount
    public double calculateFinalPrice() {
        return fee - (fee * discount / 100);
    }

    // Override displayInfo to include PaidOnlineCourse details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}

// Main class to test the hierarchy
public class CourseHierarchy {
    public static void main(String[] args) {
        // Create a PaidOnlineCourse object
        PaidOnlineCourse course = new PaidOnlineCourse(
            "Java Programming", 
            40, 
            "Udemy", 
            true, 
            100, 
            20
        );

        // Display details of the course
        course.displayInfo();
    }
}
