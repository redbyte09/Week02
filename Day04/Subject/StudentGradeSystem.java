package Subject;


import java.util.ArrayList;
import java.util.List;

// Subject Class
class Subject {
    private String subjectName;
    private int score;

    public Subject(String subjectName, int score) {
        this.subjectName = subjectName;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getSubjectName() {
        return subjectName;
    }
}

// Student Class
class Student {
    private int studentID;
    private String name;
    private List<Subject> subjects;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(String subjectName, int score) {
        subjects.add(new Subject(subjectName, score));
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }
}

// GradeCalculator Class
class GradeCalculator {
    public double calculateAverage(List<Subject> subjects) {
        int totalScore = 0;
        for (Subject subject : subjects) {
            totalScore += subject.getScore();
        }
        return subjects.size() > 0 ? (double) totalScore / subjects.size() : 0;
    }

    public String determineGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public String calculateGrade(Student student) {
        double average = calculateAverage(student.getSubjects());
        return determineGrade(average);
    }
}

// StudentGradeSystem Class
public class StudentGradeSystem {
    public static void main(String[] args) {
        // Create a Student
        Student student = new Student(1, "John Doe");

        // Add Subjects and Scores
        student.addSubject("Math", 90);
        student.addSubject("Science", 85);
        student.addSubject("English", 88);

        // Create a GradeCalculator
        GradeCalculator gradeCalculator = new GradeCalculator();

        // Calculate the Grade
        String grade = gradeCalculator.calculateGrade(student);

        // Display the Result
        System.out.println("Student: " + student.getName());
        System.out.println("Grade: " + grade);
    }
}