import static java.lang.Math.*;   // Static Import

class InterestCalculator {

    // Simple Interest
    public double calculateSimpleInterest(double P, double R, double T) {
        return (P * R * T) / 100;
    }

    // Compound Interest
    public double calculateCompoundInterest(double P, double R, double T) {
        return P * (pow((1 + R / 100), T)) - P;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        InterestCalculator calculator = new InterestCalculator();

        double principal = 10000;
        double rate = 5;
        double time = 2;

        // Simple Interest
        double si = calculator.calculateSimpleInterest(principal, rate, time);

        // Compound Interest
        double ci = calculator.calculateCompoundInterest(principal, rate, time);

        System.out.println("===== Banking Interest Report =====\n");

        System.out.println("Principal: ₹" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years\n");

        System.out.println("Simple Interest: ₹" + si);
        System.out.println("Compound Interest: ₹" + ci);
    }
}