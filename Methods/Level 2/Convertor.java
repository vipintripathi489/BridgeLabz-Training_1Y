import java.util.Scanner;

class Convertor {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();
        System.out.println("Feet = " + Convertor.convertYardsToFeet(yards));

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.println("Yards = " + Convertor.convertFeetToYards(feet));

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println("Inches = " + Convertor.convertMetersToInches(meters));

        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();
        System.out.println("Meters = " + Convertor.convertInchesToMeters(inches));
        System.out.println("Centimeters = " + Convertor.convertInchesToCm(inches));

        sc.close();
    }
}
