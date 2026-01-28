import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		if (b == 2)
		{
			System.out.println("Prime.");
		}
		for (int i = 2; i < b;i++)
		{
			if (b % i == 0)
			{		
				break;
				
			}
			else
			{
				System.out.println("Prime");
				break;
			}
		}
	}
}