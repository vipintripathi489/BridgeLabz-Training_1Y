import java.util.Scanner;
class Counter
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		while (b != 1)
		{
			System.out.println(b);
			b--;
		}
	}
}