import java.util.Scanner;

class MatrixCopy
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);

        int b = a.nextInt();
        int c = a.nextInt();

        int[][] arr1 = new int[b][c];

        for (int d = 0; d < b; d++)
        {
            for (int e = 0; e < c; e++)
            {
                arr1[d][e] = a.nextInt();
            }
        }

        int[] arr2 = new int[b * c];
        int f = 0;

        for (int d = 0; d < b; d++)
        {
            for (int e = 0; e < c; e++)
            {
                arr2[f] = arr1[d][e];
                f++;
            }
        }

        for (int d = 0; d < arr2.length; d++)
        {
            System.out.println(arr2[d]);
        }
    }
}
