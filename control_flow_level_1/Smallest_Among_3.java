import java.util.Scanner;
class SmallestAmong_3
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = a.nextInt();
		int d = a.nextInt();
		
		if (b < c)
		{
			if (b < d)
			{
				System.out.println("First_number_is_smallest.");
			}
			else
			{
				System.out.println("First_number_isn't_smallest.");
			}
		}
		else
		{
			System.out.println("First_number_isn't_smallest.");
		}
	}
}