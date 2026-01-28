import java.util.Scanner;
class GreatestFactor
{
	public static void main(String args[])
	{
		int c = 1;
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		while (b > c)
		{
			while (b % c == 0)
			{
				c++;
			}
		}
		System.out.println("Largest_factor_is : "+c);
	}
}