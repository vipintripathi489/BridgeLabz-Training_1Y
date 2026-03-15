import java.util.Scanner;

public class FactorUtility {

    public static int[] getFactors(int num) {

        // First loop → count factors
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static int getGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max)
                max = f;
        }
        return max;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static long productCubesFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }
    public static void printArray(int[] arr) {
        for (int f : arr) System.out.print(f + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.println("\nFactors of " + num + " are:");
        printArray(factors);

        System.out.println("Greatest Factor: " + getGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productCubesFactors(factors));

        sc.close();
    }
}
