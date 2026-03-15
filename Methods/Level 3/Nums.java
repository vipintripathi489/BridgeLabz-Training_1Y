import java.util.Scanner;

class Nums {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0;
        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        int temp = num;

        while (temp > 0) {
            if (temp % 10 != square % 10)
                return false;

            temp /= 10;
            square /= 10;
        }
        return true;
    }

    // e) Check Buzz Number
    public static boolean isBuzz(int num) {
        return (num % 7 == 0) || (num % 10 == 7);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\nRESULTS:");

        if (isPrime(num))
            System.out.println(" Prime Number");
        else
            System.out.println(" Not a Prime Number");

        if (isNeon(num))
            System.out.println(" Neon Number");
        else
            System.out.println(" Not a Neon Number");

        if (isSpy(num))
            System.out.println(" Spy Number");
        else
            System.out.println(" Not a Spy Number");

        if (isAutomorphic(num))
            System.out.println(" Automorphic Number");
        else
            System.out.println(" Not an Automorphic Number");

        if (isBuzz(num))
            System.out.println(" Buzz Number");
        else
            System.out.println(" Not a Buzz Number");

        sc.close();
    }
}
