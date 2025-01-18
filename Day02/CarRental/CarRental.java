package CarRental;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
   

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Setter for customerName
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter for customerName
    public String getCustomerName() {
        return customerName;
    }

    // Setter for carModel
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    // Getter for carModel
    public String getCarModel() {
        return carModel;
    }

    // Setter for rentalDays
    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    // Getter for rentalDays
    public int getRentalDays() {
        return rentalDays;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost(int rentPerDay) {
        return rentalDays * rentPerDay;
    }

    public static void main(String[] args) {
        // Create a CarRental object with rental details
        CarRental rental = new CarRental("Malan", "Toyota ", 5);

        // Display rental details and total cost
        System.out.println("Customer Name: " + rental.getCustomerName());
        System.out.println("Car Model: " + rental.getCarModel());
        System.out.println("Rental Days: " + rental.getRentalDays());
        System.out.println("Total Cost: $" + rental.calculateTotalCost(50));
    }
}
