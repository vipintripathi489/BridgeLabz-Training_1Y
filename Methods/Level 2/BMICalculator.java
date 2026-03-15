import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightMeter = heightCm / 100.0;

            double bmi = weight / (heightMeter * heightMeter);

            data[i][2] = bmi;
        }
    }

    public static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            if (bmi < 18.5)
                status[i] = "Underweight";
            else if (bmi < 25)
                status[i] = "Normal";
            else if (bmi < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][3];

        System.out.println("Enter Weight (kg) and Height (cm) for 10 persons:\n");

        for (int i = 0; i < persons.length; i++) {

            System.out.println("Person " + (i + 1));

            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);

        String[] status = getBMIStatus(persons);

        System.out.println("\n= BMI REPORT ==");
        System.out.println("Weight\tHeight\tBMI\tStatus");

        for (int i = 0; i < persons.length; i++) {

            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
                    persons[i][0],
                    persons[i][1],
                    persons[i][2],
                    status[i]);
        }

        sc.close();
    }
}
