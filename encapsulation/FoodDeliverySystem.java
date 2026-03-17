import java.util.*;

// Interface
interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

// Abstract Class
abstract class FoodItem {

    // Encapsulation
    private String itemName;
    private double price;
    private int quantity;

    protected double discountAmount = 0;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters (No direct modification allowed)
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Restrict modification via setter validation
    public void updateQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: ₹" + discountAmount);
        System.out.println("Total Price: ₹" + calculateTotalPrice());
        System.out.println("-----------------------------------");
    }

    protected double getBaseTotal() {
        return price * quantity;
    }
}

// Veg Item
class VegItem extends FoodItem implements Discountable {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getBaseTotal() - discountAmount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discountAmount = getBaseTotal() * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Discount Applied: ₹" + discountAmount;
    }
}

// Non-Veg Item
class NonVegItem extends FoodItem implements Discountable {

    private static final double NON_VEG_EXTRA_CHARGE = 50; // Extra charge per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double extraCharge = NON_VEG_EXTRA_CHARGE * getQuantity();
        return getBaseTotal() + extraCharge - discountAmount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discountAmount = getBaseTotal() * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount Applied: ₹" + discountAmount;
    }
}

// Main Class
public class OnlineFoodDeliverySystem {

    // Polymorphic Order Processing Method
    public static void processOrder(List<FoodItem> items) {
        for (FoodItem item : items) {

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                d.applyDiscount(10); // Apply 10% discount
                System.out.println(d.getDiscountDetails());
            }

            item.getItemDetails();
        }
    }

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 3));

        processOrder(order);
    }
}