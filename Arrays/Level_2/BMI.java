import java.util.Scanner;

class BMIProgram
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);

        int b = a.nextInt();

        double[] arr1 = new double[b];
        double[] arr2 = new double[b];
        double[] arr3 = new double[b];
        String[] arr4 = new String[b];

        for (int c = 0; c < b; c++)
        {
            arr1[c] = a.nextDouble();
            arr2[c] = a.nextDouble();
        }

        for (int c = 0; c < b; c++)
        {
            arr3[c] = arr1[c] / (arr2[c] * arr2[c]);

            if (arr3[c] < 18.5)
                arr4[c] = "Underweight";
            else if (arr3[c] < 25)
                arr4[c] = "Normal";
            else if (arr3[c] < 30)
                arr4[c] = "Overweight";
            else
                arr4[c] = "Obese";
        }

        for (int c = 0; c < b; c++)
        {
            System.out.println(arr2[c] + " " + arr1[c] + " " + arr3[c] + " " + arr4[c]);
        }
    }
}
