package Library;
import java.util.ArrayList;
//creat a class here
class Book {
    private String title;
    private String author;
   //creat a constructor here
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
  //create getter and setter here
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    //create array here
    private ArrayList<Book> books;

    public Library() {
        //initializing empty array here
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("LIFE", "Mlani");
        Book book2 = new Book("Once Upon", "Robert");

        // Creating Library objects
        Library library1 = new Library();
        Library library2 = new Library();

        // Adding books to libraries
        library1.addBook(book1);
        library2.addBook(book2);

        // Displaying books in each library
        System.out.println("Library 1:");
        library1.displayBooks();
        System.out.println("\nLibrary 2:");
        library2.displayBooks();
    }
}
