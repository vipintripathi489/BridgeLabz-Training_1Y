interface ReportExporter {

    void exportToCSV(String data);

    void exportToPDF(String data);

    // Newly added feature
    default void exportToJSON(String data) {
        System.out.println("JSON export not supported by this exporter.");
    }
}

// Existing Implementation 1
class SalesReportExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("Exporting Sales Report to CSV: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("Exporting Sales Report to PDF: " + data);
    }

    // Overrides JSON support
    @Override
    public void exportToJSON(String data) {
        System.out.println("Exporting Sales Report to JSON: { \"report\": \"" + data + "\" }");
    }
}

// Existing Implementation 2 (No JSON Support)
class InventoryReportExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("Exporting Inventory Report to CSV: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("Exporting Inventory Report to PDF: " + data);
    }
}

public class ReportingApp {

    public static void main(String[] args) {

        ReportExporter sales = new SalesReportExporter();
        sales.exportToCSV("Sales Data");
        sales.exportToJSON("Sales Data");

        System.out.println();

        ReportExporter inventory = new InventoryReportExporter();
        inventory.exportToPDF("Inventory Data");
        inventory.exportToJSON("Inventory Data"); // Uses default method
    }
}