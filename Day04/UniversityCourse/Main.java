package UniversityCourse;

import java.util.ArrayList;
import java.util.List;

// Class to represent a Course
class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.enrollCourse(this);  // Ensure bidirectional association
        }
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

// Class to represent a Professor
class Professor {
    private String name;
    private List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignToCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.assignProfessor(this);  // Ensure bidirectional association
        }
    }

    public void displayCourses() {
        System.out.println("Professor: " + name + " - Teaching Courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
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

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);  // Ensure bidirectional association
        }
    }

    public void displayCourses() {
        System.out.println("Student: " + name + " - Enrolled Courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Main class to demonstrate the University Management System
public class Main {
    public static void main(String[] args) {
        // Create some courses
        Course math = new Course("Math");
        Course science = new Course("Science");

        // Create some professors
        Professor profSmith = new Professor("Prof. Anjani");
        Professor profJones = new Professor("Prof. Dolly");

        // Create some students
        Student alice = new Student("Sapna");
        Student bob = new Student("Nandani");

        // Assign professors to courses
        profSmith.assignToCourse(math);
        profJones.assignToCourse(science);

        // Enroll students in courses
        alice.enrollCourse(math);
        alice.enrollCourse(science);
        bob.enrollCourse(math);

        // Display information
        math.displayCourseInfo();
        science.displayCourseInfo();

        alice.displayCourses();
        bob.displayCourses();

        profSmith.displayCourses();
        profJones.displayCourses();
    }
}
