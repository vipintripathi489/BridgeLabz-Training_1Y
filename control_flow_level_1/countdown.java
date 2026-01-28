import java.util.Scanner;
class Countdown
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		for (int i = b; i > 0; i--)
		{
			System.out.println(i);
		}
	}
}