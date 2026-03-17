import java.util.*;

// Interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract Class
abstract class Vehicle {

    // Encapsulation
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Location (protected through interface methods)
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Not Updated";
    }

    // Getters (No direct modification allowed)
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }

    protected String getLocation() {
        return currentLocation;
    }

    protected void setLocation(String location) {
        this.currentLocation = location;
    }

    // Abstract Method
    public abstract double calculateFare(double distance);

    // Concrete Method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }
}

// Car Class
class Car extends Vehicle implements GPS {

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50; // Base charge ₹50
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

// Bike Class
class Bike extends Vehicle implements GPS {

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // No base charge
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

// Auto Class
class Auto extends Vehicle implements GPS {

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; // Base charge ₹20
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

// Main Class
public class RideHailingApplication {

    // Polymorphic Fare Calculation Method
    public static void processRide(List<Vehicle> vehicles, double distance) {
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance));
            System.out.println("--------------------------------------");
        }
    }

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle v1 = new Car("C101", "Anant Raj", 15);
        Vehicle v2 = new Bike("B202", "Riya Sharma", 8);
        Vehicle v3 = new Auto("A303", "Rahul Verma", 10);

        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);

        // Update locations using GPS
        ((GPS) v1).updateLocation("Hazratganj");
        ((GPS) v2).updateLocation("Alambagh");
        ((GPS) v3).updateLocation("Gomti Nagar");

        // Polymorphism
        processRide(vehicles, 10); // 10 km ride
    }
}