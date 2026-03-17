interface UnitConverter {

    // Length Conversion
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double milesToKm(double miles) {
        return miles / 0.621371;
    }

    // Mass Conversion
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }

    static double lbsToKg(double lbs) {
        return lbs / 2.20462;
    }
}

public class LogisticsApp {

    public static void main(String[] args) {

        double distanceKm = 10;
        double weightKg = 50;

        System.out.println(distanceKm + " km = " +
                UnitConverter.kmToMiles(distanceKm) + " miles");

        System.out.println(weightKg + " kg = " +
                UnitConverter.kgToLbs(weightKg) + " lbs");
    }
}