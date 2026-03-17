import java.io.*;

// Custom Marker Interface
interface BackupEligible {
    // No methods (Marker Interface)
}

// Class eligible for backup
class CustomerData implements BackupEligible, Serializable {

    private String name;
    private int policyNumber;

    public CustomerData(String name, int policyNumber) {
        this.name = name;
        this.policyNumber = policyNumber;
    }

    @Override
    public String toString() {
        return "CustomerData{name='" + name + "', policyNumber=" + policyNumber + "}";
    }
}

// Class NOT eligible for backup
class TemporarySessionData {
    private String sessionId;

    public TemporarySessionData(String sessionId) {
        this.sessionId = sessionId;
    }
}

// Backup Processor
class BackupProcessor {

    public static void processBackup(Object obj) {

        if (obj instanceof BackupEligible) {
            System.out.println("Backing up object: " + obj);
            // Serialization logic can be added here
        } else {
            System.out.println("This object is not eligible for backup.");
        }
    }
}

public class BackupApp {

    public static void main(String[] args) {

        CustomerData customer = new CustomerData("Anant", 10123);
        TemporarySessionData session = new TemporarySessionData("ABC123");

        BackupProcessor.processBackup(customer); // Allowed
        BackupProcessor.processBackup(session);  // Not allowed
    }
}