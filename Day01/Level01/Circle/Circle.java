//creating a class here
public class Circle
{
 //creating private feilds here
    private double radius;
   // method constructor here
    public Circle(double radius)
    {
        this.radius=radius;
    }
    // method here to find circumFerence
    public double circumFerence()
    {
       double pi=3.14;
        return 2*pi*radius;
    }
    //create method here to find Area of Circle
    public double areaOfCircle()
    {
        double pi=3.14;
        return pi*radius*radius;
    }
    public static void main(String[] args) {
        //create an object here and pass the value too
        Circle circle=new Circle(6.7);
        //call the methods here
        double circumFerence=circle.circumFerence();
        double area=circle.areaOfCircle();
        System.out.println("Circumference: " + circumFerence);
        System.out.println("Area: " + area);
    }
   
}