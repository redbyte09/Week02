package Product;

public class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts each time a new Product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating product instances
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 699.99);
        Product product3 = new Product("Tablet", 399.99);

        // Displaying product details
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        // Displaying total number of products
        Product.displayTotalProducts();
    }
}
