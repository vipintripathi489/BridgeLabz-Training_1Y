import java.util.Scanner;

class FizzBuzz
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();

        if (b < 0)
        {
            System.out.println("Error");
            return;
        }

        String[] arr1 = new String[b + 1];

        for (int c = 0; c <= b; c++)
        {
            if (c % 3 == 0 && c % 5 == 0)
                arr1[c] = "FizzBuzz";
            else if (c % 3 == 0)
                arr1[c] = "Fizz";
            else if (c % 5 == 0)
                arr1[c] = "Buzz";
            else
                arr1[c] = String.valueOf(c);
        }

        for (int c = 0; c <= b; c++)
        {
            System.out.println("Position " + c + " = " + arr1[c]);
        }
    }
}