// Digital Payment Interface System

// Step 1: Define Interface
interface Payment {
    void pay(double amount);
}

// Step 2: Implement Interface in Different Payment Methods

// UPI Class
class UPI implements Payment {

    private String upiId;   // Encapsulation

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done successfully using UPI ID: " + upiId);
    }
}

// Credit Card Class
class CreditCard implements Payment {

    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done successfully using Credit Card: ****" 
                           + cardNumber.substring(cardNumber.length() - 4));
    }
}

// Wallet Class
class Wallet implements Payment {

    private String walletName;

    public Wallet(String walletName) {
        this.walletName = walletName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done successfully using Wallet: " + walletName);
    }
}

// Main Class
public class DigitalPaymentSystem {

    // Polymorphism Method
    public static void processPayment(Payment payment, double amount) {
        payment.pay(amount);
        System.out.println();
    }

    public static void main(String[] args) {

        Payment upi = new UPI("anant@upi");
        Payment creditCard = new CreditCard("1234567812345678");
        Payment wallet = new Wallet("Paytm");

        processPayment(upi, 1500);
        processPayment(creditCard, 2500);
        processPayment(wallet, 800);
    }
}