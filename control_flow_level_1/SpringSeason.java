import java.util.Scanner;
class SpringSeason
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
	
		if (b > 3 && b < 6)
		{
			int c = a.nextInt();
			if (c > 19 && c < 31)
			{
				System.out.println("It's_Spring.");
			}
			else
			{
				if (b == 3 || b == 5 && c == 31)
				{
					System.out.println("It's_Spring.");
				}
				else
				{
					System.out.println("Invalid");
				}
			}
		}
		else
		{
			System.out.println("It_isn't_Spring.");
		}
	}
	
}