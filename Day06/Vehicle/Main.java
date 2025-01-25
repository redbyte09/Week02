package Vehicle;

abstract class Vehicle implements Insurable {
    private int vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(int vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type of Vehicle: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    }

    abstract double calculateRentalCost();
}

interface Insurable {
    double calculateInsurance();

    void getInsuranceDetails();
}

class Car extends Vehicle {
    private int days;
    private int percentage;

    public Car(int vehicleNumber, String type, double rentalRate, int days, int percentage) {
        super(vehicleNumber, type, rentalRate);
        this.days = days;
        this.percentage = percentage;
    }

    @Override
    public double calculateRentalCost() {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return percentage * getRentalRate();
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Cost: " + calculateInsurance());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Days Rented: " + days);
        System.out.println("Percentage for Insurance: " + percentage);
        System.out.println("Total Rental Cost: " + calculateRentalCost());
        getInsuranceDetails();
    }
}

class Bike extends Vehicle {
    private int days;
    private int percentage;

    public Bike(int vehicleNumber, String type, double rentalRate, int days, int percentage) {
        super(vehicleNumber, type, rentalRate);
        this.days = days;
        this.percentage = percentage;
    }

    @Override
    public double calculateRentalCost() {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return percentage * getRentalRate();
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Cost: " + calculateInsurance());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Days Rented: " + days);
        System.out.println("Percentage for Insurance: " + percentage);
        System.out.println("Total Rental Cost: " + calculateRentalCost());
        getInsuranceDetails();
    }
}

class Truck extends Vehicle {
    private int days;
    private int percentage;

    public Truck(int vehicleNumber, String type, double rentalRate, int days, int percentage) {
        super(vehicleNumber, type, rentalRate);
        this.days = days;
        this.percentage = percentage;
    }

    @Override
    public double calculateRentalCost() {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return percentage * getRentalRate();
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Cost: " + calculateInsurance());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Days Rented: " + days);
        System.out.println("Percentage for Insurance: " + percentage);
        System.out.println("Total Rental Cost: " + calculateRentalCost());
        getInsuranceDetails();
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(121, "Fortuner", 50000, 2, 2);
        Vehicle bike = new Bike(11, "Bullet", 1000, 1, 1);
        Vehicle truck = new Truck(10, "Big", 500, 5, 4);

        System.out.println("Car Details:");
        car.displayDetails();
        System.out.println();

        System.out.println("Bike Details:");
        bike.displayDetails();
        System.out.println();

        System.out.println("Truck Details:");
        truck.displayDetails();
    }
}
