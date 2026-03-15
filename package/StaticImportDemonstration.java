import static java.lang.Math.*;

public class StaticImportDemo {

    public static void main(String[] args) {

        double number = 25;

        // 1. sqrt()
        System.out.println("Square Root: " + sqrt(number));

        // 2. pow()
        System.out.println("Power (5^3): " + pow(5, 3));

        // 3. max()
        System.out.println("Maximum of 10 and 20: " + max(10, 20));

        // 4. min()
        System.out.println("Minimum of 10 and 20: " + min(10, 20));

        // 5. abs()
        System.out.println("Absolute value of -15: " + abs(-15));
    }
}