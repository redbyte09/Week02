package FoodDelivery;

// Abstract class FoodItem with fields and methods
abstract class FoodItem implements Discountable {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and Setter for itemName
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter for quantity
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Abstract method to calculate total price of food item
    abstract double calculateTotalPrice();

    // Concrete method to display food item details
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

// Interface Discountable with methods to apply and get discount details
interface Discountable {
    void applyDiscount(double discountPercentage);
    void getDiscountDetails();
}

// VegItem class extending FoodItem and implementing Discountable interface
class VegItem extends FoodItem  {
    private double discount;
    private final double discountRate = 5.0; // Discount for VegItems in percentage

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Overriding calculateTotalPrice for VegItem
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity(); // No extra charge for VegItems
    }

    // Implementing applyDiscount for VegItem
    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = (getPrice() * discountPercentage / 100) * getQuantity();
        System.out.println("Discount applied: " + discountPercentage + "%");
    }

    // Implementing getDiscountDetails for VegItem
    @Override
    public void getDiscountDetails() {
        System.out.println("Total discount for VegItem: " + discount);
    }
}

// NonVegItem class extending FoodItem and implementing Discountable interface
class NonVegItem extends FoodItem {
    private double discount;
    private final double discountRate = 10.0; // Discount for NonVegItems in percentage

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Overriding calculateTotalPrice for NonVegItem
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 2.0; // Additional charge for NonVegItems
    }

    // Implementing applyDiscount for NonVegItem
    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = (getPrice() * discountPercentage / 100) * getQuantity();
        System.out.println("Discount applied: " + discountPercentage + "%");
    }

    // Implementing getDiscountDetails for NonVegItem
    @Override
    public void getDiscountDetails() {
        System.out.println("Total discount for NonVegItem: " + discount);
    }
}

// Main class to test the Online Food Delivery System
public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Creating instances of FoodItem subclasses
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 150.0, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 200.0, 3);

        // Displaying details and total price for each item
        System.out.println("\n--- Veg Item Details ---");
        vegItem.getItemDetails();
        System.out.println("Total Price for VegItem: " + vegItem.calculateTotalPrice());
        vegItem.applyDiscount(5.0); // Applying discount for VegItem
        vegItem.getItemDetails(); // Displaying discount details for VegItem

        System.out.println("\n--- Non-Veg Item Details ---");
        nonVegItem.getItemDetails();
        System.out.println("Total Price for NonVegItem: " + nonVegItem.calculateTotalPrice());
        nonVegItem.applyDiscount(10.0); // Applying discount for NonVegItem
        nonVegItem.getItemDetails(); // Displaying discount details for NonVegItem
    }
}
