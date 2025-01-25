// create a class Book
public class Book
{
    //taking Fields 
    String title;
    String author;
    double price;
  //create constructor here
    public Book()//default constructor
    {

    }
    // parameterized constructor
    public Book(String title, String author, double price){
         this.title=title;
         this.author=author;
         this.price=price;
    }
    //create method display
    public void displayDetails()
    {
        System.out.println("Book title :" +title);
        System.out.println("Author " +author);
        System.out.println("Price " +price);
    }
  //create main method here
    public static void main(String[] args) {
        //create object here
        Book book=new Book();
        Book book2=new Book("Life is not same for everyone","Sakshi",500.0);
        //calling method here by using object
        book.displayDetails();
        book2.displayDetails();
    }
}