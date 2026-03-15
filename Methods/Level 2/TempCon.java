import java.util.Scanner;

public class TempCon {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Pounds to Kilograms");
            System.out.println("4. Kilograms to Pounds");
            System.out.println("5. Gallons to Liters");
            System.out.println("6. Liters to Gallons");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    double f = sc.nextDouble();
                    System.out.println("Celsius = " +
                            UnitConvertor.convertFarhenheitToCelsius(f));
                    break;

                case 2:
                    System.out.print("Enter Celsius: ");
                    double c = sc.nextDouble();
                    System.out.println("Fahrenheit = " +
                            UnitConvertor.convertCelsiusToFarhenheit(c));
                    break;

                case 3:
                    System.out.print("Enter Pounds: ");
                    double p = sc.nextDouble();
                    System.out.println("Kilograms = " +
                            UnitConvertor.convertPoundsToKilograms(p));
                    break;

                case 4:
                    System.out.print("Enter Kilograms: ");
                    double kg = sc.nextDouble();
                    System.out.println("Pounds = " +
                            UnitConvertor.convertKilogramsToPounds(kg));
                    break;

                case 5:
                    System.out.print("Enter Gallons: ");
                    double g = sc.nextDouble();
                    System.out.println("Liters = " +
                            UnitConvertor.convertGallonsToLiters(g));
                    break;

                case 6:
                    System.out.print("Enter Liters: ");
                    double l = sc.nextDouble();
                    System.out.println("Gallons = " +
                            UnitConvertor.convertLitersToGallons(l));
                    break;

                case 0:
                    System.out.println("Thank you for using Unit Converter 😊");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}


class UnitConvertor {

    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5.0 / 9.0;
    }

    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
}
