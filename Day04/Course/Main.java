package Course;

import java.util.ArrayList;
import java.util.List;

// Class to represent a Course
class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.enrollInCourse(this);  // Ensure bidirectional association
        }
    }

    public void displayStudents() {
        System.out.println("Course: " + courseName + " - Enrolled Students:");
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
        }
    }
}

// Class to represent a Student
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);  // Ensure bidirectional association
        }
    }

    public void displayCourses() {
        System.out.println("Student: " + name + " - Enrolled Courses:");
        for (Course course : courses) {
            System.out.println("Course: " + course.getCourseName());
        }
    }
}

// Class to represent a School
class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void displayStudents() {
        System.out.println("School: " + schoolName + " - Students:");
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
        }
    }
}

// Main class to demonstrate the relationship
public class Main {
    public static void main(String[] args) {
        // Create a School
        School school = new School("Greenfield High");

        // Create Students
        Student student1 = new Student("Sam");
        Student student2 = new Student("Bobby");

        // Create Courses
        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Display school, student, and course details
        school.displayStudents();
        student1.displayCourses();
        student2.displayCourses();
        course1.displayStudents();
        course2.displayStudents();
    }
}

