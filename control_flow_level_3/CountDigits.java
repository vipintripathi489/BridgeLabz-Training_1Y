import java.util.Scanner;

class CountDigits
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = 0;

        while (b != 0)
        {
            b = b / 10;
            c++;
        }

        System.out.println("Numbe_ of_digits : " + c);
    }
}
