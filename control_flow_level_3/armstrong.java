import java.util.Scanner;

class Armstrong
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int sum = 0;
        int originalNumber = b;
        while (originalNumber != 0)
        {
            b = originalNumber % 10;
            sum = sum + (b * b * b);

            originalNumber = originalNumber / 10;
        }
        if (sum == b)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
}
