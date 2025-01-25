package Book;

public class Book {
    private String title;
    private String author;
    private Double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title of the book" + title);
        System.out.println("Author's name" + author);
        System.out.println("Price of book" + price);
    }

    public static void main(String[] args) {
        Book book = new Book("Life is not same for everyone", "Pratap", 500.0);
        book.displayDetails();
    }

}
