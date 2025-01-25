package VehicleRide;

// Abstract class Vehicle implements GPS interface
abstract class Vehicle implements GPS {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;  // Base rate per km

    // Constructor to initialize vehicle details
    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getter and Setter for vehicleId
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    // Getter and Setter for driverName
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    // Getter and Setter for ratePerKm
    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate fare (to be implemented by subclasses)
    abstract double calculateFare(double distance);

    // Concrete method to get vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle Id is: " + vehicleId);
        System.out.println("Driver Name is: " + driverName);
        System.out.println("Rate per Km is: " + ratePerKm);
    }
}

// GPS Interface with methods related to vehicle location
interface GPS {
    void getCurrentLocation();
    void updateLocation(String newLocation);
}

// Subclass Car extending Vehicle and implementing GPS
class Car extends Vehicle {
    private String location;

    // Constructor to initialize Car specific details
    public Car(int vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    // Overriding calculateFare for Car (fare based on distance)
    public double calculateFare(double distance) {
        // Car fare calculation: base rate per km
        return distance * getRatePerKm();
    }

    // Overriding getCurrentLocation to display the car's current location
    public void getCurrentLocation() {
        System.out.println("Current location of Car: " + location);
    }

    // Overriding updateLocation to update car's location
    public void updateLocation(String newLocation) {
        this.location = newLocation;
        System.out.println("Car's new location is: " + newLocation);
    }
}

// Subclass Bike extending Vehicle and implementing GPS
class Bike extends Vehicle {
    private String location;

    // Constructor to initialize Bike specific details
    public Bike(int vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    // Overriding calculateFare for Bike (fare based on distance and a lower rate)
    public double calculateFare(double distance) {
        // Bike fare calculation: bike has a cheaper rate
        return distance * getRatePerKm() ;
    }

    // Overriding getCurrentLocation to display the bike's current location
    public void getCurrentLocation() {
        System.out.println("Current location of Bike: " + location);
    }

    // Overriding updateLocation to update bike's location
    public void updateLocation(String newLocation) {
        this.location = newLocation;
        System.out.println("Bike's new location is: " + newLocation);
    }
}

// Subclass Auto extending Vehicle and implementing GPS
class Auto extends Vehicle {
    private String location;

    // Constructor to initialize Auto specific details
    public Auto(int vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    // Overriding calculateFare for Auto (fare based on distance and a flat rate)
    public double calculateFare(double distance) {
        // Auto fare calculation: base rate plus a flat rate per km
        return (distance * getRatePerKm()) ;  
    }

    // Overriding getCurrentLocation to display the auto's current location
    public void getCurrentLocation() {
        System.out.println("Current location of Auto: " + location);
    }

    // Overriding updateLocation to update auto's location
    public void updateLocation(String newLocation) {
        this.location = newLocation;
        System.out.println("Auto's new location is: " + newLocation);
    }
}

// Main class to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        // Create instances of each vehicle type
        Vehicle car = new Car(1, "Sneha", 10, "Ananad Nagar");
        Vehicle bike = new Bike(2, "Ronak", 5, "Katni");
        Vehicle auto = new Auto(3, "Divyani", 7, "Panna");

        // Show vehicle details
        car.getVehicleDetails();
        bike.getVehicleDetails();
        auto.getVehicleDetails();

        // Demonstrating polymorphism: calculate fare for different vehicle types
        System.out.println("Car Fare for 15 km: " + car.calculateFare(15));
        System.out.println("Bike Fare for 15 km: " + bike.calculateFare(15));
        System.out.println("Auto Fare for 15 km: " + auto.calculateFare(15));

        // Demonstrating GPS methods: get and update location
        car.getCurrentLocation();
        bike.getCurrentLocation();
        auto.getCurrentLocation();

        // Update locations
        car.updateLocation("Mumbai");
        bike.updateLocation("Goa");
        auto.updateLocation("MP");
    }
}
