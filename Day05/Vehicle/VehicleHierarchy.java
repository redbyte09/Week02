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
        Vehicle[] vehicles = new Vehicle[3];

        // Creating objects of Car, Truck, and Motorcycle
        vehicles[0] = new Car(200, "Petrol", 5);
        vehicles[1] = new Truck(100, "Diesel", "Heavy");
        vehicles[2] = new Motorcycle(150, "Petrol");

        // Displaying information for each vehicle
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("---------------------");
        }
    }
}
