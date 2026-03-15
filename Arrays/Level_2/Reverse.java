import java.util.Scanner;

class ReverseNumber
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

        int[] arr2 = new int[d];
        int f = 0;

        for (int g = d - 1; g >= 0; g--)
        {
            arr2[f] = arr1[g];
            f++;
        }

        for (int g = 0; g < d; g++)
        {
            System.out.print(arr2[g]);
        }
    }
}
