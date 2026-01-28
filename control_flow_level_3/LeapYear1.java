import java.util.Scanner;
class LeapYear1
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		if ((b >= 1582 && b % 4 == 0 && b % 400 == 0) || (b >= 1582 && b % 4 == 0 && b % 100 != 0))
		{
			System.out.println("Leap_year.");
		}
		else
		{
			System.out.println("Not_a_leap_year.");
		}
	}
}