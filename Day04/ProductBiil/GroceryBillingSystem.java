package ProductBiil;

import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String name;
    private double pricePerUnit;
    private double quantity;

    public Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return pricePerUnit * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return name + " (" + quantity + " units at $" + pricePerUnit + " per unit)";
    }
}

// Customer class
class Customer {
    private String name;
    // Composition: A customer owns multiple products
    private List<Product> purchasedProducts; 

    public Customer(String name) {
        this.name = name;
        this.purchasedProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }

    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public String getName() {
        return name;
    }
}

// BillGenerator class
class BillGenerator {
    public static void generateBill(Customer customer) {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products Purchased:");

        double total = 0.0;
        for (Product product : customer.getPurchasedProducts()) {
            System.out.println(product);
            total += product.calculateTotalPrice();
        }

        System.out.println("Total Bill Amount: $" + total);
    }
}

// Main class to demonstrate the system
public class GroceryBillingSystem {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("Alice");

        // Add purchased products
        customer.addProduct(new Product("Apples", 3.0, 2.0)); 
        customer.addProduct(new Product("Milk", 2.0, 1.0));   

        // Generate the bill
        BillGenerator.generateBill(customer);
    }
}
