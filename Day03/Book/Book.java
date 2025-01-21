package Book;

public class Book {
    // Static variable shared across all books
    private static String libraryName = "Apni Library";
    
    // Final variable to ensure ISBN cannot be changed once assigned
    private final int isbn;
    
    // Instance variables for title and author
    private String title;
    private String author;
    
    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    
    // Constructor using 'this' to initialize title, author, and isbn
    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    // Getter methods
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getIsbn() {
        return isbn;
    }
    
    // Method to display book details if the object is an instance of Book class
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Book Title: " + this.getTitle());
            System.out.println("Book Author: " + this.getAuthor());
            System.out.println("Book ISBN: " + this.getIsbn());
        } else {
            System.out.println("This object is not an instance of Book class.");
        }
    }
    
    public static void main(String[] args) {
        // Creating instances of Book
        Book book1 = new Book("The Life", "Daydreamer", 123456);
        Book book2 = new Book("1984", "George Orwell", 789012);
        
        // Displaying the library name
        Book.displayLibraryName();
        
        // Displaying details of each book
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
