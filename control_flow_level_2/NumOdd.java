import java.util.Scanner;
class NumOdd
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		for (int i = 0;i <= b;i++)
		{
			if (i % 2 != 0)
			{
				System.out.println(i);
			}
		}
	}
}