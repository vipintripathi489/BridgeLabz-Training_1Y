import java.util.Scanner;

class BMIProgram
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);

        int b = a.nextInt();

        double[][] personData = new double[b][3];
        String[] weightStatus = new String[b];

        for (int c = 0; c < b; c++)
        {
            double d = a.nextDouble();
            double e = a.nextDouble();

            if (d <= 0 || e <= 0)
            {
                c--;
            }
            else
            {
                personData[c][0] = d;
                personData[c][1] = e;
            }
        }

        for (int c = 0; c < b; c++)
        {
            personData[c][2] = personData[c][0] / (personData[c][1] * personData[c][1]);

            if (personData[c][2] < 18.5)
                weightStatus[c] = "Underweight";
            else if (personData[c][2] < 25)
                weightStatus[c] = "Normal";
            else if (personData[c][2] < 30)
                weightStatus[c] = "Overweight";
            else
                weightStatus[c] = "Obese";
        }

        for (int c = 0; c < b; c++)
        {
            System.out.println(personData[c][1] + " " + personData[c][0] + " " + personData[c][2] + " " + weightStatus[c]);
        }
    }
}
