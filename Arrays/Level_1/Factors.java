import java.util.Scanner;

class Factors
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();

        int c = 10;
        int[] arr1 = new int[c];
        int d = 0;

        for (int e = 1; e <= b; e++)
        {
            if (b % e == 0)
            {
                if (d == c)
                {
                    c = c * 2;
                    int[] arr2 = new int[c];

                    for (int f = 0; f < arr1.length; f++)
                    {
                        arr2[f] = arr1[f];
                    }

                    arr1 = arr2;
                }

                arr1[d] = e;
                d++;
            }
        }

        for (int e = 0; e < d; e++)
        {
            System.out.println(arr1[e]);
        }
    }
}
