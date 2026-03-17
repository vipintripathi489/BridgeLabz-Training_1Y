interface PaymentProcessor {

    void processPayment(double amount);

    // New feature added without breaking old implementations
    default void refund(double amount) {
        System.out.println("Refund feature not supported by this provider.");
    }
}

// Existing Provider 1
class CreditCardProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }

    // Overriding refund (supports refund)
    @Override
    public void refund(double amount) {
        System.out.println("Refunding ₹" + amount + " to credit card.");
    }
}

// Existing Provider 2 (Does not override refund)
class UPIProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}

public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor creditCard = new CreditCardProcessor();
        creditCard.processPayment(5000);
        creditCard.refund(1000);

        System.out.println();

        PaymentProcessor upi = new UPIProcessor();
        upi.processPayment(2000);
        upi.refund(500);  // Uses default method
    }
}