import java.util.Scanner;

class GradeProgram
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);

        int b = a.nextInt();

        double[][] arr1 = new double[b][3];
        double[] arr2 = new double[b];
        String[] arr3 = new String[b];

        for (int c = 0; c < b; c++)
        {
            double d = a.nextDouble();
            double e = a.nextDouble();
            double f = a.nextDouble();

            if (d < 0 || e < 0 || f < 0)
            {
                c--;
            }
            else
            {
                arr1[c][0] = d;
                arr1[c][1] = e;
                arr1[c][2] = f;
            }
        }

        for (int c = 0; c < b; c++)
        {
            arr2[c] = (arr1[c][0] + arr1[c][1] + arr1[c][2]) / 3.0;

            if (arr2[c] >= 80)
                arr3[c] = "A";
            else if (arr2[c] >= 70)
                arr3[c] = "B";
            else if (arr2[c] >= 60)
                arr3[c] = "C";
            else if (arr2[c] >= 50)
                arr3[c] = "D";
            else if (arr2[c] >= 40)
                arr3[c] = "E";
            else
                arr3[c] = "R";
        }

        for (int c = 0; c < b; c++)
        {
            System.out.println(arr1[c][0] + " " + arr1[c][1] + " " + arr1[c][2] + " " + arr2[c] + " " + arr3[c]);
        }
    }
}
