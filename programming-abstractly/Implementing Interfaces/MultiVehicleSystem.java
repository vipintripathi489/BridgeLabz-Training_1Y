// Multi-Vehicle Rental System

interface Rentable {
    void rent();
    void returnVehicle();
}

// Car Class
class Car implements Rentable {

    private String vehicleNumber;
    private boolean isRented;

    public Car(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.isRented = false;
    }

    public void rent() {
        if (!isRented) {
            isRented = true;
            System.out.println("Car " + vehicleNumber + " has been rented.");
        } else {
            System.out.println("Car " + vehicleNumber + " is already rented.");
        }
    }

    public void returnVehicle() {
        if (isRented) {
            isRented = false;
            System.out.println("Car " + vehicleNumber + " has been returned.");
        } else {
            System.out.println("Car " + vehicleNumber + " was not rented.");
        }
    }
}

// Bike Class
class Bike implements Rentable {

    private String vehicleNumber;
    private boolean isRented;

    public Bike(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.isRented = false;
    }

    public void rent() {
        if (!isRented) {
            isRented = true;
            System.out.println("Bike " + vehicleNumber + " has been rented.");
        } else {
            System.out.println("Bike " + vehicleNumber + " is already rented.");
        }
    }

    public void returnVehicle() {
        if (isRented) {
            isRented = false;
            System.out.println("Bike " + vehicleNumber + " has been returned.");
        } else {
            System.out.println("Bike " + vehicleNumber + " was not rented.");
        }
    }
}

// Bus Class
class Bus implements Rentable {

    private String vehicleNumber;
    private boolean isRented;

    public Bus(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.isRented = false;
    }

    public void rent() {
        if (!isRented) {
            isRented = true;
            System.out.println("Bus " + vehicleNumber + " has been rented.");
        } else {
            System.out.println("Bus " + vehicleNumber + " is already rented.");
        }
    }

    public void returnVehicle() {
        if (isRented) {
            isRented = false;
            System.out.println("Bus " + vehicleNumber + " has been returned.");
        } else {
            System.out.println("Bus " + vehicleNumber + " was not rented.");
        }
    }
}

// Main Class
public class RentalSystem {

    // Polymorphic Method
    public static void processRental(Rentable vehicle) {
        vehicle.rent();
        vehicle.returnVehicle();
        System.out.println();
    }

    public static void main(String[] args) {

        Rentable car = new Car("GJ01-1234");
        Rentable bike = new Bike("GJ02-5678");
        Rentable bus = new Bus("GJ03-9999");

        processRental(car);
        processRental(bike);
        processRental(bus);
    }
}