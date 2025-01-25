package Product;

public class Product {
    // Static variable 

    private static double discount = 0.0;
    
    // Final variable to ensure the product ID cannot be changed once assigned
    private final int productID;
    
    // Instance variables for product details
    private String productName;
    private double price;
    private int quantity;
    
    // Constructor using 'this' to initialize productName, price, and quantity
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    
    // Getter methods
    public int getProductID() {
        return productID;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public static double getDiscount() {
        return discount;
    }
    
    // Method to calculate the price after discount
    public double calculateDiscountedPrice() {
        return price - (price * discount / 100);
    }
    
    // Method to display product details if the object is an instance of Product
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + this.getProductID());
            System.out.println("Product Name: " + this.getProductName());
            System.out.println("Price: $" + this.getPrice());
            System.out.println("Quantity: " + this.getQuantity());
            System.out.println("Discounted Price: $" + this.calculateDiscountedPrice());
        } else {
            System.out.println("This object is not an instance of Product class.");
        }
    }
    
    public static void main(String[] args) {
        // Creating instances of Product
        Product product1 = new Product(101, "Laptop", 1500.00, 2);
        Product product2 = new Product(102, "Smartphone", 800.00, 5);
        
        // Updating the discount
        Product.updateDiscount(10.0);
        
        // Displaying product details
        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}
