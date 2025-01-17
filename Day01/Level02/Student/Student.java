package Student;
public class Student
{
    String name;
    int rollNumber;
    double marks;

public Student(String name,int rollNumber,double marks)
{
    this.name=name;
    this.rollNumber=rollNumber;
    this.marks=marks;
}
public String calculateGrade()
{
    if(marks>=90)
    {
        return "A";
    }
    else if(marks>=80)
    {
        return "B";
    }
    else if(marks>=70)
    {
        return "C";
    }
    else if(marks>=60)
    {
        return "D";
    }
    else
    {
        return "E";
    }
}
public void displayDetails()
{
    System.out.println("Name of student"+name);
    System.out.println("Roll Number of student"+rollNumber);
    System.out.println("Marks of student"+marks);
    System.out.println("Grades of student"+calculateGrade());
}
public static void main(String[] args) {
    Student student=new Student("Pranjal", 1, 95);
    student.displayDetails();
}

}