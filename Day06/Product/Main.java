package Product;

abstract class Product implements Taxable {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    abstract double calculateDiscount();

    public abstract void display();
}

interface Taxable {
    double calculateTax();

    void getTaxDetails();
}

class Electronics extends Product {
    private int discount;
    private int taxRate;

    public Electronics(int productId, String name, double price, int discount, int taxRate) {
        super(productId, name, price);
        this.discount = discount;
        this.taxRate = taxRate;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setTax(int taxRate) {
        this.taxRate = taxRate;
    }

    public int getTax() {
        return taxRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() - (getPrice() * discount) / 100;
    }

    @Override
    public double calculateTax() {
        return calculateDiscount() * taxRate / 100;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax is: " + calculateTax());
    }

    @Override
    public void display() {
        System.out.println("Electronics Details:");
        System.out.println("Product ID: " + getProductId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Total Discount: " + calculateDiscount());
        System.out.println("Total Tax: " + calculateTax());
        getTaxDetails();
    }
}

class Clothing extends Product {
    private int discount;
    private int taxRate;

    public Clothing(int productId, String name, double price, int discount, int taxRate) {
        super(productId, name, price);
        this.discount = discount;
        this.taxRate = taxRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() - (getPrice() * discount) / 100;
    }

    @Override
    public double calculateTax() {
        return calculateDiscount() * taxRate / 100;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax is: " + calculateTax());
    }

    @Override
    public void display() {
        System.out.println("Clothing Details:");
        System.out.println("Product ID: " + getProductId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Total Discount: " + calculateDiscount());
        System.out.println("Total Tax: " + calculateTax());
        getTaxDetails();
    }
}

class Groceries extends Product {
    private int discount;
    private int taxRate;

    public Groceries(int productId, String name, double price, int discount, int taxRate) {
        super(productId, name, price);
        this.discount = discount;
        this.taxRate = taxRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() - (getPrice() * discount) / 100;
    }

    @Override
    public double calculateTax() {
        return calculateDiscount() * taxRate / 100;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax is: " + calculateTax());
    }

    @Override
    public void display() {
        System.out.println("Groceries Details:");
        System.out.println("Product ID: " + getProductId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Total Discount: " + calculateDiscount());
        System.out.println("Total Tax: " + calculateTax());
        getTaxDetails();
    }
}

public class Main {
    public static void main(String[] args) {
        Product electronics = new Electronics(102, "Phone", 15000, 5, 2);
        Product clothing = new Clothing(121, "Dress", 890, 3, 1);
        Product groceries = new Groceries(110, "Maggi", 150, 10, 5);

        // Display details for each product
        electronics.display();
        System.out.println("----------------------------");
        clothing.display();
        System.out.println("----------------------------");
        groceries.display();
    }
}
