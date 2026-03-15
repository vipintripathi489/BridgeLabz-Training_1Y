import java.util.Scanner;

class Digits
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();

        int c = 10;
        int[] arr1 = new int[c];
        int d = 0;

        while (b != 0)
        {
            int e = b % 10;
            arr1[d] = e;
            b = b / 10;
            d++;

            if (d == c)
                break;
        }

        int f = 0;
        int g = 0;

        for (int h = 0; h < d; h++)
        {
            if (arr1[h] > f)
            {
                g = f;
                f = arr1[h];
            }
            else if (arr1[h] > g)
            {
                g = arr1[h];
            }
        }

        System.out.println(f);
        System.out.println(g);
    }
}
