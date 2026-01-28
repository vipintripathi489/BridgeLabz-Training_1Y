import java.util.Scanner;
class NsumFor
{
	public static void main(String args[])
	{
		int d = 0;
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		if (b > 0)
		{
			int c = b * (b + 1)/2;
			System.out.println("By_condition : "+c);
			for (int i = b; i >= 1; i--)
			{
				d += i;
			}
			System.out.println("By_loop : "+d);
		}
		else
		{
			System.out.println("Given_number_isn't_natural.");
		}
	}
}