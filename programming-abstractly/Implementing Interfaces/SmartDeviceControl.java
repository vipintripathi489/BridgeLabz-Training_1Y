// Interface
interface SmartDevice {
    void turnOn();
    void turnOff();
}

// Light Class
class Light implements SmartDevice {

    private String location;  // Encapsulation

    public Light(String location) {
        this.location = location;
    }

    @Override
    public void turnOn() {
        System.out.println("Light in " + location + " is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light in " + location + " is OFF.");
    }
}

// AC Class
class AC implements SmartDevice {

    private int temperature;  // Encapsulation

    public AC(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        System.out.println("AC is ON at " + temperature + "°C.");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is OFF.");
    }
}

// TV Class
class TV implements SmartDevice {

    private String brand;  // Encapsulation

    public TV(String brand) {
        this.brand = brand;
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " TV is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " TV is OFF.");
    }
}

// Main Class
public class SmartHomeControl {

    public static void main(String[] args) {

        // Polymorphism
        SmartDevice device1 = new Light("Living Room");
        SmartDevice device2 = new AC(24);
        SmartDevice device3 = new TV("Samsung");

        SmartDevice[] devices = {device1, device2, device3};

        for (SmartDevice device : devices) {
            device.turnOn();
            device.turnOff();
            System.out.println("----------------------");
        }
    }
}