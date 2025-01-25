package Vehicle;

class Vehicle {

    int maxSpeed;
    String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Maximum speed is " + maxSpeed);
        System.out.println("Fuel Type is " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    String tyreType;

    public Truck(int maxSpeed, String fuelType, String tyreType) {
        super(maxSpeed, fuelType);
        this.tyreType = tyreType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tyre Type: " + tyreType);
    }
}

class Motorcycle extends Vehicle {

    public Motorcycle(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("This is a motorcycle");
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        // Creating objects of Car, Truck, and Motorcycle
        Vehicle car = new Car(200, "Petrol", 5);
        Vehicle truck = new Truck(100, "Diesel", "Heavy");
        Vehicle motorcycle = new Motorcycle(150, "Petrol");

        // Displaying information for each vehicle
        car.displayInfo();
        System.out.println("\n");
        truck.displayInfo();
        System.out.println("\n");
        motorcycle.displayInfo();
    }
}
