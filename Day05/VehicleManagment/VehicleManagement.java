package VehicleManagment;

// Superclass: Vehicle
class Vehicle {
    private String model;
    private int maxSpeed;

    // Constructor
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Display common vehicle details
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface: Refuelable
interface Refuelable {
    // Abstract method for refueling
    void refuel();
}

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh

    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println("Charging the electric vehicle. Battery capacity: " + batteryCapacity + " kWh");
    }

    // Display additional details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelTankCapacity; // in liters

    // Constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Implement refuel method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle. Fuel tank capacity: " + fuelTankCapacity + " liters");
    }

    // Display additional details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

// Main class to test the hybrid inheritance
public class VehicleManagement {
    public static void main(String[] args) {
        // Create an ElectricVehicle instance
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250, 100);

        // Create a PetrolVehicle instance
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);

        // Display details and functionalities of ElectricVehicle
        System.out.println("Electric Vehicle Details:");
        ev.displayInfo();
        ev.charge();
        System.out.println();

        // Display details and functionalities of PetrolVehicle
        System.out.println("Petrol Vehicle Details:");
        pv.displayInfo();
        pv.refuel();
    }
}

