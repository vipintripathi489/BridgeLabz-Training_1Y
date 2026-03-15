import java.util.Scanner;

class DigitFrequency
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();

        int c = b;
        int d = 0;

        while (c != 0)
        {
            c = c / 10;
            d++;
        }

        int[] arr1 = new int[d];
        int e = 0;

        while (b != 0)
        {
            arr1[e] = b % 10;
            b = b / 10;
            e++;
        }

        int[] arr2 = new int[10];

        for (int f = 0; f < d; f++)
        {
            arr2[arr1[f]]++;
        }

        for (int f = 0; f < 10; f++)
        {
            System.out.println(f + " " + arr2[f]);
        }
    }
}
