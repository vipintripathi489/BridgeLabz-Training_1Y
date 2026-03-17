import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatUtils {

    // Static method to format date
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class InvoiceGenerator {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("Default Date: " + today);

        System.out.println("Format 1: " +
                DateFormatUtils.formatDate(today, "dd-MM-yyyy"));

        System.out.println("Format 2: " +
                DateFormatUtils.formatDate(today, "MM/dd/yyyy"));

        System.out.println("Format 3: " +
                DateFormatUtils.formatDate(today, "yyyy-MM-dd"));

        System.out.println("Format 4: " +
                DateFormatUtils.formatDate(today, "dd MMM yyyy"));
    }
}