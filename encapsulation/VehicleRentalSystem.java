import java.util.*;

// Interface
interface Insurable {
    double calculateInsurance(int days);
    String getInsuranceDetails();
}

// Abstract Class
abstract class Vehicle {

    // Encapsulation
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters and Setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract Method
    public abstract double calculateRentalCost(int days);

    // Display method
    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Cost (" + days + " days): ₹" + calculateRentalCost(days));

        if (this instanceof Insurable) {
            Insurable ins = (Insurable) this;
            System.out.println(ins.getInsuranceDetails());
            System.out.println("Insurance Cost: ₹" + ins.calculateInsurance(days));
            System.out.println("Total Cost: ₹" + 
                (calculateRentalCost(days) + ins.calculateInsurance(days)));
        }

        System.out.println("--------------------------------------");
    }
}

// Car Class
class Car extends Vehicle implements Insurable {

    // Sensitive detail (Encapsulation)
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return 500 * days; // ₹500 per day insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + maskPolicyNumber();
    }

    // Restrict direct access to policy number
    private String maskPolicyNumber() {
        return "****" + insurancePolicyNumber.substring(
                insurancePolicyNumber.length() - 4);
    }
}

// Bike Class
class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return 200 * days; // ₹200 per day insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: ****" + 
               insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}

// Truck Class
class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 1000; 
        // Extra fixed heavy vehicle charge
    }

    @Override
    public double calculateInsurance(int days) {
        return 800 * days; // ₹800 per day insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: ****" + 
               insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}

// Main Class
public class VehicleRentalSystem {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("UP32AB1234", 2000, "CAR987654321"));
        vehicles.add(new Bike("UP32XY5678", 800, "BIK123456789"));
        vehicles.add(new Truck("UP32TR9999", 5000, "TRK112233445"));

        int days = 3;

        // Polymorphism
        for (Vehicle v : vehicles) {
            v.displayDetails(days);
        }
    }
}