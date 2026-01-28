import java.util.Scanner;
class NsumWhile
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
			while (b >= 1)
			{
				d += b;
				b--;
			}
			System.out.println("By_loop : "+d);
		}
		else
		{
			System.out.println("Given_number_isn't_natural.");
		}
	}
}