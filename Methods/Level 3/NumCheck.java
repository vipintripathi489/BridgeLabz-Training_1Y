import java.util.Scanner;

public class NumCheck {

    public static int countDigits(int num) {
        num = Math.abs(num);
        if (num == 0) return 1;

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int[] getDigitsArray(int num) {
        num = Math.abs(num);
        int size = countDigits(num);
        int[] digits = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumSquaresDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumDigits(digits);
        return num % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" NUMBER CHECKER UTILITY ");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = getDigitsArray(num);

        System.out.println("\nDigits Count: " + countDigits(num));

        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");

        int sum = sumDigits(digits);
        int sumSquares = sumSquaresDigits(digits);

        System.out.println("\n\nSum of Digits: " + sum);
        System.out.println("Sum of Squares of Digits: " + sumSquares);

        System.out.println("Harshad Number: " + (isHarshad(num, digits) ? "YES" : "NO"));

        int[][] freq = digitFrequency(digits);

        System.out.println("\nDigit Frequency:");
        System.out.println("Digit | Count");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("  " + freq[i][0] + "   |   " + freq[i][1]);
            }
        }

        sc.close();
    }
}
