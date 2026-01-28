import java.util.Scanner;
class LargestAmong3
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = a.nextInt();
		int d = a.nextInt();
		if (b > c)
		{
			if (b > d)
			{
				System.out.println("First_number_is_largest.");
			}
			else
			{
				System.out.println("Third_number_is_largest.");
			}
		}
		else
		{
			if (c > d)
			{
				System.out.println("Second_number_is_largest.");
			}
			else
			{
				System.out.println("Third_number_is_largest.");
			}
		}
	}
}