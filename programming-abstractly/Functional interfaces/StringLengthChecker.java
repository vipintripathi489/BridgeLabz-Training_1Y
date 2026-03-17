import java.util.Scanner;
import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Character limit
        final int CHARACTER_LIMIT = 50;

        // Function to calculate length of a string
        Function<String, Integer> getLength = str -> str.length();

        System.out.print("Enter your message: ");
        String message = sc.nextLine();

        int length = getLength.apply(message);

        System.out.println("Message Length: " + length);

        if (length > CHARACTER_LIMIT) {
            System.out.println("Message exceeds the character limit of " + CHARACTER_LIMIT);
        } else {
            System.out.println("Message is within the character limit.");
        }

        sc.close();
    }
}