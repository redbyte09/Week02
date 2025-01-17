package CarItem;
//create class here 
class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize CartItem
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for item details
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate the total cost for this item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display the details of the item
    public void displayDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity + ", Total: " + getTotalCost());
    }
}

public class ShoppingCart {
    private CartItem item1;
    private CartItem item2;
    private CartItem item3;

    // Constructor to initialize the shopping cart with no items
    public ShoppingCart() {
        this.item1 = null;
        this.item2 = null;
        this.item3 = null;
    }

    // Method to add an item to the cart
    public void addItemToCart(int itemNumber, String itemName, double price, int quantity) {
        if (itemNumber == 1) {
            item1 = new CartItem(itemName, price, quantity);
            System.out.println(itemName + " added to the cart.");
        } else if (itemNumber == 2) {
            item2 = new CartItem(itemName, price, quantity);
            System.out.println(itemName + " added to the cart.");
        } else if (itemNumber == 3) {
            item3 = new CartItem(itemName, price, quantity);
            System.out.println(itemName + " added to the cart.");
        } else {
            System.out.println("No more items can be added.");
        }
    }

    // Method to remove an item from the cart
    public void removeItemFromCart(int itemNumber) {
        if (itemNumber == 1 && item1 != null) {
            item1 = null;
            System.out.println("Item 1 removed from the cart.");
        } else if (itemNumber == 2 && item2 != null) {
            item2 = null;
            System.out.println("Item 2 removed from the cart.");
        } else if (itemNumber == 3 && item3 != null) {
            item3 = null;
            System.out.println("Item 3 removed from the cart.");
        } else {
            System.out.println("No item found to remove.");
        }
    }

    // Method to display all items in the cart
    public void displayCartItems() {
        if (item1 != null) item1.displayDetails();
        if (item2 != null) item2.displayDetails();
        if (item3 != null) item3.displayDetails();
    }

    // Method to calculate and display the total cost of all items in the cart
    public void displayTotalCost() {
        double totalCost = 0;
        if (item1 != null) totalCost += item1.getTotalCost();
        if (item2 != null) totalCost += item2.getTotalCost();
        if (item3 != null) totalCost += item3.getTotalCost();
        System.out.println("Total Cost of all items in the cart: " + totalCost);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        cart.addItemToCart(1, "Laptop", 50000, 1);
        cart.addItemToCart(2, "Smartphone", 15000, 2);
        cart.addItemToCart(3, "Headphones", 2000, 3);

        // Display all items
        cart.displayCartItems();

        // Display total cost
        cart.displayTotalCost();

        // Remove an item from the cart
        cart.removeItemFromCart(2); // Remove Smartphone

        // Display all items after removal
        cart.displayCartItems();

        // Display total cost after removal
        cart.displayTotalCost();
    }
}

