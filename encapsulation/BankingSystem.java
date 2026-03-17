import java.util.*;

// Interface
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract Class
abstract class BankAccount {

    // Encapsulation (private fields)
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters (No direct balance modification allowed)
    public String getAccountNumber() {
        return "XXXXXX" + accountNumber.substring(accountNumber.length() - 4); // masked
    }

    public String getHolderName() {
        return holderName;
    }

    protected double getBalance() {
        return balance;
    }

    // Controlled deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        }
    }

    // Controlled withdrawal
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Abstract Method
    public abstract double calculateInterest();

    // Display Method
    public void displayDetails() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Interest: ₹" + calculateInterest());
        System.out.println("------------------------------------");
    }
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {

    private double loanAmount;

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        this.loanAmount = amount;
        System.out.println("Loan Applied: ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 20000; // Eligible if balance >= 20k
    }
}

// Current Account
class CurrentAccount extends BankAccount implements Loanable {

    private double loanAmount;

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    @Override
    public void applyForLoan(double amount) {
        this.loanAmount = amount;
        System.out.println("Loan Applied: ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 50000; // Higher eligibility requirement
    }
}

// Main Class
public class BankingSystem {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        BankAccount acc1 = new SavingsAccount("123456789012", "Anant Raj", 30000);
        BankAccount acc2 = new CurrentAccount("987654321098", "Riya Sharma", 60000);

        accounts.add(acc1);
        accounts.add(acc2);

        // Polymorphism
        for (BankAccount acc : accounts) {

            acc.deposit(5000);
            acc.withdraw(2000);
            acc.displayDetails();

            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                loan.applyForLoan(100000);
                System.out.println("Loan Eligible: " + loan.calculateLoanEligibility());
            }

            System.out.println("====================================");
        }
    }
}