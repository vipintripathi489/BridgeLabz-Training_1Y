import java.util.Scanner;
class factorialWhile
{
	public static void main(String args[])
	{
		int c = 1;
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		while (b >= 1)
		{
			c *= b;
			b--;
		}
		System.out.println("Factorial : "+c);
	}
}