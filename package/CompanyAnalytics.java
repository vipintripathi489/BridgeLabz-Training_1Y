class SalesReport {

    public void printSalesReport() {
        System.out.println("---- Sales Report ----");
        System.out.println("North Region: ₹5,00,000");
        System.out.println("South Region: ₹3,50,000");
        System.out.println("East Region: ₹4,20,000");
        System.out.println("West Region: ₹2,80,000");
    }
}

class EmployeeReport {

    public void printEmployeeReport() {
        System.out.println("\n---- Employee Performance Report ----");
        System.out.println("Anant - Excellent");
        System.out.println("Riya - Good");
        System.out.println("Rahul - Very Good");
    }
}

public class CompanyAnalytics {

    public static void main(String[] args) {

        SalesReport sales = new SalesReport();
        EmployeeReport hr = new EmployeeReport();

        System.out.println("===== Company Combined Report =====\n");

        sales.printSalesReport();
        hr.printEmployeeReport();
    }
}