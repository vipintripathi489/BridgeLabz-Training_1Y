import java.util.Scanner;

public class RandomStats {

    public static int[] generate4DigitRandomArray(int size) {

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }

        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {

        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double avg = sum / numbers.length;

        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" RANDOM NUMBER ");
        System.out.print("Enter how many 4-digit random numbers to generate: ");
        int size = sc.nextInt();

        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.println("\nGenerated Numbers:");
        System.out.println("-------------------");

        for (int num : randomNumbers) {
            System.out.print(num + "  ");
        }

        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("\n\n===== RESULTS =====");
        System.out.printf("Average : %.2f\n", result[0]);
        System.out.println("Minimum : " + (int)result[1]);
        System.out.println("Maximum : " + (int)result[2]);

        sc.close();
    }
}
