import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		if(b >= 1582)
		{
			if (b % 4 == 0)
			{
				if (b % 400 == 0)
				}
					System.out.println("leap_year.");
				}
				else if (b % 100 != 0)
				{
					System.out.println("leap_year.");
				}
				else
				{
					System.out.println("leap_year.");
				}
			}
			else
			{
				System.out.println("Not_a_leap_year.");
			}
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}