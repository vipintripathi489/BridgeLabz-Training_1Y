class Vehicle implements Cloneable {

    private String model;
    private double price;

    public Vehicle(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Override clone method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();  // Shallow copy
    }

    @Override
    public String toString() {
        return "Vehicle{model='" + model + "', price=" + price + "}";
    }
}

public class PrototypeApp {

    public static void main(String[] args) {

        try {
            Vehicle original = new Vehicle("Tesla Model 3", 45000);

            // Clone object
            Vehicle cloned = (Vehicle) original.clone();

            System.out.println("Original Object: " + original);
            System.out.println("Cloned Object:   " + cloned);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}