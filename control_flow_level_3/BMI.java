import java.util.Scanner;

class BMI
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);

        double b = a.nextDouble();
        double c = a.nextDouble();

        double d = c / 100;
        double e = b / (d * d);

        System.out.println("BMI=" + e);

        if (e < 18.5)
            System.out.println("Underweight");
        else if (e >= 18.5 && e < 25)
            System.out.println("Normal_weight");
        else if (e >= 25 && e < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
