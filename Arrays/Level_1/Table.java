import java.util.Scanner;

class Table
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int[] arr1 = new int[10];

        for (int c = 1; c <= 10; c++)
        {
            arr1[c - 1] = b * c;
        }

        for (int c = 1; c <= 10; c++)
        {
            System.out.println(b + " * " + c + " = " + arr1[c - 1]);
        }
    }
}
