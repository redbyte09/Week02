package BookBorrow;

public class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Book()
    {
        this.title="Unknown";
        this.author="Unknown";
        this.price=0.0;
        this.isAvailable=true;
    }

    public Book(String title,String author, double price,boolean isAvailable)
    {
        this.title=title;
        this.author=author;
        this.price=price;
        this.isAvailable=isAvailable;
    }
    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter for availability
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
            return true;
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
            return false;
        }
    }
    public static void main(String[] args) {
        // Creating a book object
        Book book1 = new Book("The Moon Is Beautiful ", "Lord Son's", 10.99, true);

        // Displaying book details
        System.out.println("Book: " + book1.getTitle() + ", Author: " + book1.getAuthor() + ", Price: $" + book1.getPrice());

        // Attempting to borrow the book
        book1.borrowBook();

        // Attempting to borrow the book again to show it is unavailable
        book1.borrowBook();
    }
    }

