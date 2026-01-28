import java.util.Scanner;
class factor
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		for (int i = 1; i <= b;i++)
		{
			if (b % i == 0)
			{
				System.out.print(i+"  ");
			}
		}
	}
}