import java.util.Scanner;
class GreatestFactorFor
{
	public static void main(String args[])
	{
		int i;
		int c = 0;
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		for (i = 1; i < b;i++)
		{
			if (b % i != 0)
			{
				continue;
			}
			else
			{
				c = i;
			}
		}
		System.out.println("Largest_factor_is : "+ c);
	}
}