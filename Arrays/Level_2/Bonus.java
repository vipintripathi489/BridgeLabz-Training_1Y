import java.util.Scanner;

class Bonus
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);

        double[] arr1 = new double[10];
        double[] arr2 = new double[10];
        double[] arr3 = new double[10];
        double[] arr4 = new double[10];

        double b = 0.0;
        double c = 0.0;
        double d = 0.0;

        for (int e = 0; e < 10; e++)
        {
            double f = a.nextDouble();
            double g = a.nextDouble();

            if (f <= 0 || g < 0)
            {
                e--;
            }
            else
            {
                arr1[e] = f;
                arr2[e] = g;
            }
        }

        for (int e = 0; e < 10; e++)
        {
            if (arr2[e] > 5)
                arr3[e] = arr1[e] * 0.05;
            else
                arr3[e] = arr1[e] * 0.02;

            arr4[e] = arr1[e] + arr3[e];

            b = b + arr3[e];
            c = c + arr1[e];
            d = d + arr4[e];
        }

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
