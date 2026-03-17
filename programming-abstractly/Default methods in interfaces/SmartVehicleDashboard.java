interface VehicleDashboard {

    void displaySpeed(int speed);

    // New feature added later
    default void displayBatteryPercentage(int batteryLevel) {
        System.out.println("Battery status not available for this vehicle.");
    }
}

// Existing Vehicle 1 (Petrol Car)
class PetrolCar implements VehicleDashboard {

    @Override
    public void displaySpeed(int speed) {
        System.out.println("Petrol Car Speed: " + speed + " km/h");
    }
}

// Electric Vehicle
class ElectricCar implements VehicleDashboard {

    @Override
    public void displaySpeed(int speed) {
        System.out.println("Electric Car Speed: " + speed + " km/h");
    }

    // Override new feature
    @Override
    public void displayBatteryPercentage(int batteryLevel) {
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}

public class SmartDashboardApp {

    public static void main(String[] args) {

        VehicleDashboard petrol = new PetrolCar();
        petrol.displaySpeed(80);
        petrol.displayBatteryPercentage(0);  // Uses default

        System.out.println();

        VehicleDashboard electric = new ElectricCar();
        electric.displaySpeed(60);
        electric.displayBatteryPercentage(85); // Overridden
    }
}