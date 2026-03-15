import java.util.Scanner;

public class NumbCheck {

    public static int countDigits(int num) {
        num = Math.abs(num);
        int count = 0;

        if (num == 0) return 1;

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

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }

        int original = 0;
        for (int d : digits) {
            original = original * 10 + d;
        }

        return sum == original;
    }

    public static int[] findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }
        return new int[]{largest, second};
    }

    public static int[] findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }
        return new int[]{smallest, second};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" NUMBER CHECKER UTILITY ");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = countDigits(num);
        int[] digits = getDigitsArray(num);

        System.out.println("\nNumber of digits: " + count);

        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.println("\n\nDuck Number: " + (isDuckNumber(digits) ? "YES" : "NO"));
        System.out.println("Armstrong Number: " + (isArmstrong(digits) ? "YES" : "NO"));

        int[] large = findLargestTwo(digits);
        int[] small = findSmallestTwo(digits);

        System.out.println("\nLargest Digit: " + large[0]);
        System.out.println("Second Largest Digit: " + large[1]);

        System.out.println("Smallest Digit: " + small[0]);
        System.out.println("Second Smallest Digit: " + small[1]);

        sc.close();
    }
}
