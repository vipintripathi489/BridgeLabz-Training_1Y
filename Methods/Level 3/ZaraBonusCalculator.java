public class ZaraBonusCalculator {

    public static double[][] generateEmployeeData(int n) {

        double[][] data = new double[n][2];

        for (int i = 0; i < n; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // 5-digit salary
            data[i][1] = (int)(Math.random() * 10) + 1; // service years (1–10)
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {

        int n = data.length;
        double[][] result = new double[n][2];

        for (int i = 0; i < n; i++) {

            double salary = data[i][0];
            double years = data[i][1];

            double bonus;

            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            result[i][0] = bonus;
            result[i][1] = salary + bonus;
        }

        return result;
    }

    public static void displayResults(double[][] data, double[][] result) {

        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("Emp\tSalary\tYears\tBonus\tNew Salary");


        for (int i = 0; i < data.length; i++) {

            double salary = data[i][0];
            double years = data[i][1];
            double bonus = result[i][0];
            double newSalary = result[i][1];

            totalOld += salary;
            totalBonus += bonus;
            totalNew += newSalary;

            System.out.printf("%d\t%.0f\t%.0f\t%.2f\t%.2f\n",
                    (i + 1), salary, years, bonus, newSalary);
        }
        System.out.printf("TOTAL\t%.2f\t\t%.2f\t%.2f\n", totalOld, totalBonus, totalNew);
    }

    public static void main(String[] args) {

        int employees = 10;

        double[][] data = generateEmployeeData(employees);
        double[][] result = calculateBonus(data);

        displayResults(data, result);
    }
}
