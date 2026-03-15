import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generateMarks(int n) {

        int[][] marks = new int[n][3]; // Physics, Chemistry, Maths

        for (int i = 0; i < n; i++) {
            marks[i][0] = (int)(Math.random() * 90) + 10;
            marks[i][1] = (int)(Math.random() * 90) + 10;
            marks[i][2] = (int)(Math.random() * 90) + 10;
        }

        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {

        int n = marks.length;
        double[][] results = new double[n][3]; // total, avg, percent

        for (int i = 0; i < n; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;
        }

        return results;
    }

    public static void displayScoreCard(int[][] marks, double[][] results) {

        System.out.println("\nSTUDENT SCORECARD");
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\t");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] results = calculateResults(marks);

        displayScoreCard(marks, results);

        sc.close();
    }
}
