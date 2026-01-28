import java.util.Scanner;

class DayOfWeek
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);

        int b = a.nextInt();
        int c = a.nextInt();
        int d = a.nextInt();

        int e = d - (14 - b) / 12;
        int f = e + e / 4 - e / 100 + e / 400;
        int g = b + 12 * ((14 - b) / 12) - 2;
        int h = (c + f + (31 * g) / 12) % 7;

        System.out.println(h);
    }
}
