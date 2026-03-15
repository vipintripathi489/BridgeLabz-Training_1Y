import java.util.Scanner;

class Table
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int[] arr1 = new int[4];

        for (int c = 6; c <= 9; c++)
        {
            arr1[c - 6] = b * c;
        }

        for (int c = 6; c <= 9; c++)
        {
            System.out.println(b + " * " + c + " = " + arr1[c - 6]);
        }
    }
}
