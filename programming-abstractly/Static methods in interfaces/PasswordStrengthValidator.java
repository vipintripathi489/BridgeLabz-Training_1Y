import java.util.Scanner;

interface SecurityUtils {

    // Static method inside interface
    static boolean isStrongPassword(String password) {

        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if ("@#$%^&+=!".indexOf(ch) != -1) {
                hasSpecial = true;
            }
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}

public class PasswordValidatorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
            System.out.println("Password must contain:");
            System.out.println("- At least 8 characters");
            System.out.println("- Uppercase letter");
            System.out.println("- Lowercase letter");
            System.out.println("- Digit");
            System.out.println("- Special character (@#$%^&+=!)");
        }

        sc.close();
    }
}