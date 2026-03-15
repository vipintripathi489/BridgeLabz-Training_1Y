import java.util.Scanner;

public class MatrixAdvancedOperations {

    public static double[][] createRandomMatrix(int rows, int cols) {

        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = (int)(Math.random() * 9) + 1;

        return matrix;
    }

    public static void printMatrix(double[][] matrix) {

        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }

    public static double[][] transpose(double[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] trans = new double[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                trans[j][i] = matrix[i][j];

        return trans;
    }

    public static double determinant(double[][] m) {

        int n = m.length;

        if (n == 2) {
            return m[0][0]*m[1][1] - m[0][1]*m[1][0];
        }

        if (n == 3) {
            return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
                 - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
                 + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
        }

        return 0;
    }

    public static double[][] inverse2x2(double[][] m) {

        double det = determinant(m);

        if (det == 0) return null;

        double[][] inv = new double[2][2];

        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;

        return inv;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        double[][] matrix = createRandomMatrix(rows, cols);

        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        System.out.println("\nTranspose:");
        printMatrix(transpose(matrix));

        if (rows == cols) {

            double det = determinant(matrix);
            System.out.println("\nDeterminant = " + det);

            if (rows == 2) {
                double[][] inv = inverse2x2(matrix);

                if (inv != null) {
                    System.out.println("\nInverse Matrix:");
                    printMatrix(inv);
                } else {
                    System.out.println("Inverse does not exist (det = 0)");
                }
            }
        } else {
            System.out.println("\nDeterminant & Inverse only for square matrices.");
        }

        sc.close();
    }
}
