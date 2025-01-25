package LibraryItem;

abstract class LibraryItem implements Reservable {
    int itemId;
    String title;
    String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters and Setters
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemId() {
        return itemId;
    }

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

    // Abstract method to calculate loan duration
    abstract double getLoanDuration();

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item Id: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Reservable interface with reserve and check availability methods
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Book class, extending LibraryItem and implementing specific logic for loan duration
class Book extends LibraryItem {
    private double price;
    private int interest;
    private double loanAmount;

    public Book(int itemId, String title, String author, double price, int interest, double loanAmount) {
        super(itemId, title, author);
        this.price = price;
        this.interest = interest;
        this.loanAmount = loanAmount;
    }

    // Implement the loan duration logic specific to Books
    @Override
    public double getLoanDuration() {
        // Example: Loan duration is calculated based on loan amount and interest
        return (loanAmount * (1 + interest / 100)) / 12;
    }

    @Override
    public void reserveItem() {
        System.out.println("Book '" + title + "' reserved successfully.");
    }

    @Override
    public boolean checkAvailability() {
        // Example: Assuming it's always available
        return true;
    }
}

// Magazine class, extending LibraryItem and implementing specific logic for loan duration
class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(int itemId, String title, String author, int issueNumber) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
    }

    // Implement the loan duration logic specific to Magazines
    @Override
    public double getLoanDuration() {
        // Magazines have a fixed loan duration of 7 days
        return 7;
    }

    @Override
    public void reserveItem() {
        System.out.println("Magazine '" + title + "' reserved successfully.");
    }

    @Override
    public boolean checkAvailability() {
        // Example: Assuming it's always available
        return true;
    }
}

// DVD class, extending LibraryItem and implementing specific logic for loan duration
class DVD extends LibraryItem {
    private String genre;

    public DVD(int itemId, String title, String author, String genre) {
        super(itemId, title, author);
        this.genre = genre;
    }

    // Implement the loan duration logic specific to DVDs
    @Override
    public double getLoanDuration() {
        // DVDs have a fixed loan duration of 3 days
        return 3;
    }

    @Override
    public void reserveItem() {
        System.out.println("DVD '" + title + "' reserved successfully.");
    }

    @Override
    public boolean checkAvailability() {
        // Example: Assuming it's always available
        return true;
    }
}

// Main class to test the system
public class Main {
    public static void main(String[] args) {
        // Create instances of LibraryItem subclasses
        LibraryItem book = new Book(101, "The Great LIFE", "Prem Chandra", 15.99, 5, 50);
        LibraryItem magazine = new Magazine(102, "History", "Daas", 2023);
        LibraryItem dvd = new DVD(103, "Kalyug", "Rama", "Sci-Fi");

        // Display details and loan duration for each item
        book.getItemDetails();
        System.out.println("Loan Duration (months): " + book.getLoanDuration());
        book.reserveItem();
        System.out.println("Available: " + book.checkAvailability() + "\n");

        magazine.getItemDetails();
        System.out.println("Loan Duration (days): " + magazine.getLoanDuration());
        magazine.reserveItem();
        System.out.println("Available: " + magazine.checkAvailability() + "\n");

        dvd.getItemDetails();
        System.out.println("Loan Duration (days): " + dvd.getLoanDuration());
        dvd.reserveItem();
        System.out.println("Available: " + dvd.checkAvailability() + "\n");
    }
}
