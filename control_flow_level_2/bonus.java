import java.util.Scanner;
class bonus
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = a.nextInt();
		if (c > 5)
		{
			System.out.println(b + b * 5/100);
		}
	}
}