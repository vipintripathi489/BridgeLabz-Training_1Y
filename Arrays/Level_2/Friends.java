import java.util.Scanner;

class Friends
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);

        String[] arr1 = {"Amar", "Akbar", "Anthony"};
        int[] arr2 = new int[3];
        double[] arr3 = new double[3];

        for (int b = 0; b < 3; b++)
        {
            arr2[b] = a.nextInt();
            arr3[b] = a.nextDouble();
        }

        int c = 0;
        int d = 0;

        for (int b = 1; b < 3; b++)
        {
            if (arr2[b] < arr2[c])
                c = b;

            if (arr3[b] > arr3[d])
                d = b;
        }

        System.out.println(arr1[c]);
        System.out.println(arr1[d]);
    }
}