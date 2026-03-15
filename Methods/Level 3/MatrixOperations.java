import java.util.Scanner;

public class MatrixOperations {

    public static int[][] createRandomMatrix(int rows, int cols) {

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); // random 0–9
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];

        return result;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];

        return result;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = B[0].length;
        int common = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of matrices: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns of matrices: ");
        int cols = sc.nextInt();

        int[][] A = createRandomMatrix(rows, cols);
        int[][] B = createRandomMatrix(rows, cols);

        System.out.println("\nMatrix A:");
        printMatrix(A);

        System.out.println("\nMatrix B:");
        printMatrix(B);

        System.out.println("\nAddition Result:");
        printMatrix(addMatrices(A, B));

        System.out.println("\nSubtraction Result:");
        printMatrix(subtractMatrices(A, B));

        System.out.println("\nMultiplication Result:");
        printMatrix(multiplyMatrices(A, B));

        sc.close();
    }
}
