
package Employee;

 class Employee {
    String name;
    int id;
    double salary;
    
    public Employee( String name,int id,double salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void displayDetails()
    {
        System.out.println("Name "+name);
        System.out.println("ID "+id);
        System.out.println("Salary "+salary);
    }
}

class Manager extends Employee
{
    int teamSize;
    public Manager(String name,int id,double salary,int teamSize)
    {
    super(name,id,salary);
    this.teamSize=teamSize;
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Size of team "+teamSize);
    }
}

class Developer extends Employee
{
    String programmingLanguage;

    public Developer(String name,int id,double salary,String programmingLanguage)
    {
        super(name, id, salary);
    this.programmingLanguage=programmingLanguage;
    }
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Knowledge of programming Language "+programmingLanguage);
    }
}
class Intern extends Developer
{
    String knowledge;

    public Intern(String name,int id,double salary,String programmingLanguage,String knowledge)
    {
        super(name, id, salary,programmingLanguage);
        this.knowledge=knowledge;
    }
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Knowledge of subject "+knowledge);
    }
}

public class Employeehierarchy 
{
    public static void main(String[] args) {
        Employee manager =new Manager("Pranjal", 02, 150000, 12);
        Employee developer =new Developer("Sakshi", 01, 1000000, "Java") ;
        Employee intern =new Intern("Chahat", 03, 600000,"Java", "Advance");
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();

        
    }
}

