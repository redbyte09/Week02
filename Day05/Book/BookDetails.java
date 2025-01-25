package Book;

 class Book {
    String title;
    int publicationYear;

    public Book(String title,int publicationYear)
    {
        this.title=title;
        this.publicationYear=publicationYear;
    }

    public void displayInfo()
    {
        System.out.println("Title of the book "+title);
        System.out.println("Publication year "+publicationYear);
    }
}

class Author extends Book
{
    String name;
    String bio;
    public Author(String title,int publicationYear,String name,String bio )
    {
        super ( title, publicationYear);
        this.name=name;
        this.bio=bio;
    }
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Name of the Author  "+name);
        System.out.println("Bio of the book "+bio);

    }
}
public class BookDetails
{
    public static void main(String[] args)
    {
        Book book=new Author("LIFE", 120, "SAKSHI", "life is not easy for everyone");
        book.displayInfo();
    }
}
