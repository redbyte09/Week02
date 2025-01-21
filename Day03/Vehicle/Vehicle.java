package Vehicle;

public class Vehicle {
    // Static variable 
    private static double registrationFee = 500.0;
    
    // Final variable to uniquely identify each vehicle
    private final String registrationNumber;
    
    // Instance variables for vehicle details
    private String ownerName;
    private String vehicleType;
    
    // Constructor using 'this' to initialize ownerName, vehicleType, and registrationNumber
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    
    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    
    // Getter methods
    public String getOwnerName() {
        return ownerName;
    }
    
    public String getVehicleType() {
        return vehicleType;
    }
    
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    
    public static double getRegistrationFee() {
        return registrationFee;
    }
    
    // Method to display vehicle registration details if the object is an instance of Vehicle
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + this.getOwnerName());
            System.out.println("Vehicle Type: " + this.getVehicleType());
            System.out.println("Registration Number: " + this.getRegistrationNumber());
            System.out.println("Registration Fee: $" + Vehicle.getRegistrationFee());
        } else {
            System.out.println("This object is not an instance of Vehicle class.");
        }
    }
    
    public static void main(String[] args) {
        // Creating instances of Vehicle
        Vehicle vehicle1 = new Vehicle("John Doe", "Car", "ABC123");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle", "XYZ789");
        
        // Displaying vehicle registration details
        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();
        
        // Updating the registration fee
        Vehicle.updateRegistrationFee(600.0);
        
        // Displaying updated registration details
        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();
    }
}
