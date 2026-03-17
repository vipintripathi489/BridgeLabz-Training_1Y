import java.util.*;

// Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Class
abstract class Product {

    // Encapsulation
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method
    public abstract double calculateDiscount();

    // Method to calculate final price
    public double calculateFinalPrice() {
        double tax = 0;

        if (this instanceof Taxable) {
            tax = ((Taxable) this).calculateTax();
        }

        return getPrice() + tax - calculateDiscount();
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price: ₹" + price);
        System.out.println("Discount: ₹" + calculateDiscount());

        if (this instanceof Taxable) {
            System.out.println(((Taxable) this).getTaxDetails());
        }

        System.out.println("Final Price: ₹" + calculateFinalPrice());
        System.out.println("-----------------------------------");
    }
}

// Electronics (Taxable)
class Electronics extends Product implements Taxable {

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Tax (18% GST): ₹" + calculateTax();
    }
}

// Clothing (Taxable)
class Clothing extends Product implements Taxable {

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% GST
    }

    @Override
    public String getTaxDetails() {
        return "Tax (12% GST): ₹" + calculateTax();
    }
}

// Groceries (Non-Taxable example)
class Groceries extends Product {

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

// Main Class
public class ECommercePlatform {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 50000));
        products.add(new Clothing(102, "Jacket", 3000));
        products.add(new Groceries(103, "Rice Bag", 2000));

        // Polymorphism
        for (Product product : products) {
            product.displayDetails();
        }
    }
}