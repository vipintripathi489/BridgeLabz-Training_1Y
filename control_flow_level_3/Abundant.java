import java.util.Scanner;

class Abundant
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);

        int b = a.nextInt();
        int c = 0;

        for (int d = 1; d < b; d++)
        {
            if (b % d == 0)
                c = c + d;
        }

        if (c > b)
            System.out.println("Abundant_Number");
        else
            System.out.println("Not_an_Abundant_Number");
    }
}
