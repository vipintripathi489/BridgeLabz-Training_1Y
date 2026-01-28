import java.util.Scanner;

class Harshad
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);

        int b = a.nextInt();
        int c = 0;
        int d = b;

        while (d != 0)
        {
            c = c + (d % 10);
            d = d / 10;
        }

        if (b % c == 0)
            System.out.println("Harshad_Number");
        else
            System.out.println("Not_a_Harshad_Number");
    }
}
