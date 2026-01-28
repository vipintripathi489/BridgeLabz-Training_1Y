import java.util.Scanner;
class factorwhile
{
	public static void main(String args[])
	{
		int c = 1;
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		while (b > c)
		{
			if (b % c == 0)
			{
				System.out.print(c+"  ");
				c++;
			}
		}
	}
}
