import java.util.Scanner;

public class LineAndDistance {

    public static double findDistance(double x1, double y1, double x2, double y2) {

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2)
        );

        return distance;
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {

        double[] result = new double[2]; // [slope, intercept]

        if (x2 == x1) {
            System.out.println("Line is vertical → Equation: x = " + x1);
            return null;
        }

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        result[0] = m;
        result[1] = b;

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of Point 1:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter coordinates of Point 2:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);

        double[] line = findLineEquation(x1, y1, x2, y2);

        System.out.println("\nRESULTS:");

        System.out.printf("Euclidean Distance = %.2f\n", distance);

        if (line != null) {
            System.out.printf("Slope (m) = %.2f\n", line[0]);
            System.out.printf("Y-Intercept (b) = %.2f\n", line[1]);
            System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);
        }

        sc.close();
    }
}
