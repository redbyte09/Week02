//create a class MobilePhones
public class MobilePhones
{
    //create private fields 
    private String brand;
    private String model;
    private double price;
    //create constructor here
    public MobilePhones(String brand,String model,double price)
    {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    //create a method here to display things
    public void displayDetails()
    {
        System.out.println("Brand of phone"+brand);
        System.out.println("Model of the phone"+model);
        System.out.println("Price of the phone"+price);
    }
    public static void main(String[] args) {
        //create object here with arguments
        MobilePhones phones=new MobilePhones("Realme", "Narzo", 15000);
        phones.displayDetails();
    }
}