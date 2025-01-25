
package Circle;
//create a class here
public class Circle {
 //set a private feild
   private float radius;
 //create a constructor here
   public Circle()
   {
    //constructor chaining ,default radius is 1.0
       this(1.0f);
   }
   //create a constructor with user defined radius

    public Circle(float radius)
    {
        this.radius=radius;
    }
    //setter for radius
    public void setRadius(float radius)
    {
        this.radius=radius;
    }
    //getter for radius 
    public float getRadius()
    {
        return radius;
    }
    public static void main(String[] args) {
        //craete object here with default radius
        Circle circle= new Circle();
        System.out.println("Default radius "+circle.getRadius());
        //create object here with user defined radius
        Circle circle2=new Circle(5.9f);
        System.out.println("User-provided "+circle2.getRadius());

    }
    

}
