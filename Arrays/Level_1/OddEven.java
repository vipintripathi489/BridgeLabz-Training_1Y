import java.util.Scanner;

class OddEven
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();

        if (b <= 0)
        {
            System.out.println("Error");
            return;
        }

        int[] arr1 = new int[b / 2 + 1];
        int[] arr2 = new int[b / 2 + 1];

        int c = 0;
        int d = 0;

        for (int e = 1; e <= b; e++)
        {
            if (e % 2 == 0)
            {
                arr1[c] = e;
                c++;
            }
            else
            {
                arr2[d] = e;
                d++;
            }
        }

        for (int e = 0; e < d; e++)
        {
            System.out.println(arr2[e]);
        }

        for (int e = 0; e < c; e++)
        {
            System.out.println(arr1[e]);
        }
    }
}
