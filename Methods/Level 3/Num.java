import java.util.*;

class Num {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigitsArray(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    public static boolean areArraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = countDigits(num);
        int[] digits = getDigitsArray(num);

        System.out.println("\nTotal digits: " + count);

        System.out.print("Digits Array: ");
        printArray(digits);

        int[] reversed = reverseArray(digits);
        System.out.print("Reversed Array: ");
        printArray(reversed);

        System.out.println("Arrays Equal? " + areArraysEqual(digits, reversed));

        if (isPalindrome(digits))
            System.out.println("It is a PALINDROME number.");
        else
            System.out.println("Not a palindrome.");

        if (isDuckNumber(digits))
            System.out.println("It is a DUCK number.");
        else
            System.out.println("Not a duck number.");

        sc.close();
    }
}
