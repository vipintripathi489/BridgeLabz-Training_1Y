import java.util.*;

// Interface
interface Reservable {
    void reserveItem(String borrowerName, String borrowerContact);
    boolean checkAvailability();
}

// Abstract Class
abstract class LibraryItem {

    // Encapsulation
    private int itemId;
    private String title;
    private String author;
    private boolean isAvailable = true;

    // Secure borrower data (private)
    private String borrowerName;
    private String borrowerContact;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract Method
    public abstract int getLoanDuration();  // in days

    // Concrete Method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Available: " + isAvailable);
        System.out.println("------------------------------------");
    }

    // Protected methods for subclasses
    protected void setBorrowerDetails(String name, String contact) {
        this.borrowerName = name;
        this.borrowerContact = contact;
        this.isAvailable = false;
    }

    protected boolean isAvailable() {
        return isAvailable;
    }

    protected void returnItem() {
        this.borrowerName = null;
        this.borrowerContact = null;
        this.isAvailable = true;
    }
}

// Book Class
class Book extends LibraryItem implements Reservable {

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days
    }

    @Override
    public void reserveItem(String borrowerName, String borrowerContact) {
        if (checkAvailability()) {
            setBorrowerDetails(borrowerName, borrowerContact);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

// Magazine Class
class Magazine extends LibraryItem implements Reservable {

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }

    @Override
    public void reserveItem(String borrowerName, String borrowerContact) {
        if (checkAvailability()) {
            setBorrowerDetails(borrowerName, borrowerContact);
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

// DVD Class
class DVD extends LibraryItem implements Reservable {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5; // 5 days
    }

    @Override
    public void reserveItem(String borrowerName, String borrowerContact) {
        if (checkAvailability()) {
            setBorrowerDetails(borrowerName, borrowerContact);
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

// Main Class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(101, "Java Programming", "James Gosling"));
        items.add(new Magazine(102, "Tech Today", "Editorial Team"));
        items.add(new DVD(103, "Inception", "Christopher Nolan"));

        // Polymorphism
        for (LibraryItem item : items) {
            item.getItemDetails();
        }

        // Reserving an item
        Reservable reservableItem = (Reservable) items.get(0);
        reservableItem.reserveItem("Anant Raj", "9876543210");

        System.out.println("Availability After Reservation: " +
                reservableItem.checkAvailability());
    }
}