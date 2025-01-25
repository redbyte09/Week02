package BookLibrary;

// Parent class
public class Book {
    // Public member
    public String ISBN;

    // Protected member
    protected String title;

    // Private member
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass
class EBook extends Book {
    private String fileSize;

    // Constructor
    public EBook(String ISBN, String title, String author, String fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display eBook details
    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN); // Access public member
        System.out.println("Title: " + title); // Access protected member
        System.out.println("File Size: " + fileSize);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("123-456-789", "Effective Java", "Joshua Bloch");
        book.displayBookDetails();

        // Modify and access the author using public methods
        book.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + book.getAuthor());

        // Create an EBook object
        EBook eBook = new EBook("987-654-321", "Java Concurrency", "Brian Goetz", "5MB");
        eBook.displayEBookDetails();
    }
}
