import java.util.Scanner;

class MeanHeight
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);
        double[] heights = new double[11];
        double b = 0.0;

        for (int c = 0; c < 11; c++)
        {
            heights[c] = a.nextDouble();
        }

        for (int c = 0; c < 11; c++)
        {
            b = b + heights[c];
        }

        double d = b / 11;

        System.out.println(d);
    }
}
