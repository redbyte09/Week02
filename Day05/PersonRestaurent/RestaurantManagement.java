package PersonRestaurent;

// Superclass: Person
class Person {
    private String name;
    private int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Display basic information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    // Abstract method to be implemented by subclasses
    void performDuties();
}

// Subclass: Chef (inherits from Person and implements Worker)
class Chef extends Person implements Worker {
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Implement performDuties() method
    @Override
    public void performDuties() {
        System.out.println("Duties: Preparing meals and ensuring food quality.");
    }

    // Display additional details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialty: " + specialty);
    }
}

// Subclass: Waiter (inherits from Person and implements Worker)
class Waiter extends Person implements Worker {
    private String section;

    // Constructor
    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    // Implement performDuties() method
    @Override
    public void performDuties() {
        System.out.println("Duties: Serving customers and taking orders.");
    }

    // Display additional details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Section: " + section);
    }
}

// Main class to test the hybrid inheritance
public class RestaurantManagement {
    public static void main(String[] args) {
        // Create instances of Chef and Waiter
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("John Doe", 201, "Outdoor Section");

        // Display Chef details and perform duties
        System.out.println("Chef Details:");
        chef.displayInfo();
        chef.performDuties();
        System.out.println();

        // Display Waiter details and perform duties
        System.out.println("Waiter Details:");
        waiter.displayInfo();
        waiter.performDuties();
    }
}
