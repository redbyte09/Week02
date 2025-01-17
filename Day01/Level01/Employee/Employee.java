//craeting class Employee
public class Employee
{
	//craeting private fields here
	private String name;
	private int id;
	private double salary;
	//creating constructor this is parameterized 
	public Employee(String name,int id,int salary){
	this.name=name;
	this.id=id;
	this.salary=salary;
   }
   //creating a method of  displayDetails
   public void displayDetails()
	{
		//display information here 
		System.out.println("Employee Name:" +name);
		System.out.println("Id:" +id);
		System.out.println("Salary:" +salary);
	}
	public static void main(String[] args) {
		//creat object here
		Employee emp=new Employee("Pranjal",101,100000);
		//call the method here
		emp.displayDetails();

		
		
		
	}
}	
   