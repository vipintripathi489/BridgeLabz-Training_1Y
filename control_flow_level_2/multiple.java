import java.util.Scanner;
class multiples
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		for (int i = 100; i > 1; i--)
		{
			if (i % b == 0)
			{
				System.out.println(i+"  ");
			}
		}
	}
}