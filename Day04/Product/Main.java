package Product;

import java.util.ArrayList;
import java.util.List;

// Class to represent a Product
class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

// Class to represent an Order
class Order {
    private int orderId;
    private List<Product> products;
    private Customer customer;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
        this.customer = customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products in Order:");
        for (Product product : products) {
            System.out.println("- " + product.getProductName() + " ($" + product.getPrice() + ")");
        }
    }
}

// Class to represent a Customer
class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void displayOrders() {
        System.out.println("Customer: " + name + " - Orders:");
        for (Order order : orders) {
            order.displayOrderDetails();
            System.out.println();
        }
    }
}

// Main class to demonstrate the E-commerce Platform
public class Main {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);
        Product product3 = new Product("Headphones", 150.00);

        // Create a customer
        Customer customer1 = new Customer("Sakshi");

        // Create an order and add products
        Order order1 = new Order(1, customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Customer places the order
        customer1.placeOrder(order1);

        // Create another order
        Order order2 = new Order(2, customer1);
        order2.addProduct(product3);

        // Customer places another order
        customer1.placeOrder(order2);

        // Display customer's orders
        customer1.displayOrders();
    }
}
