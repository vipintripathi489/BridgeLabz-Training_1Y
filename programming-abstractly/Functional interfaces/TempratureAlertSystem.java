import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {

        double threshold = 40.0;  // Alert threshold temperature

        // Predicate to check if temperature crosses threshold
        Predicate<Double> isHighTemperature = temp -> temp > threshold;

        // Sample temperature readings
        double[] temperatures = {35.5, 39.0, 41.2, 45.0, 38.7};

        for (double temp : temperatures) {
            checkTemperature(temp, isHighTemperature);
        }
    }

    // Method using Predicate
    public static void checkTemperature(double temperature, Predicate<Double> condition) {

        if (condition.test(temperature)) {
            System.out.println("ALERT! Temperature " + temperature + "°C crossed threshold!");
        } else {
            System.out.println("Temperature " + temperature + "°C is normal.");
        }
    }
}