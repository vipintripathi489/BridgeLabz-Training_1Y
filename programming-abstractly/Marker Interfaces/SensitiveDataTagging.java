import java.util.Base64;

// Custom Marker Interface
interface SensitiveData {
    // No methods (Marker Interface)
}

// Class containing sensitive information
class UserCredentials implements SensitiveData {

    private String username;
    private String password;

    public UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserCredentials{username='" + username + "', password='" + password + "'}";
    }
}

// Normal class (not sensitive)
class ProductInfo {
    private String productName;

    public ProductInfo(String productName) {
        this.productName = productName;
    }
}

// Encryption Processor
class EncryptionProcessor {

    public static void process(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Sensitive data detected. Encrypting...");

            String encrypted = Base64.getEncoder()
                    .encodeToString(obj.toString().getBytes());

            System.out.println("Encrypted Data: " + encrypted);
        } else {
            System.out.println("No encryption required.");
        }
    }
}

public class SecurityApp {

    public static void main(String[] args) {

        UserCredentials credentials =
                new UserCredentials("Anant", "pass@123");

        ProductInfo product =
                new ProductInfo("Laptop");

        EncryptionProcessor.process(credentials);
        EncryptionProcessor.process(product);
    }
}