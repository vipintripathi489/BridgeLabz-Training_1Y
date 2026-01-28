import java.util.Scanner;
class factorial
{
	public static void main(String args[])
	{
		int c = 1;
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		for (int i = 1; i <= b;i++)
		{
			c *= i;
		}
		System.out.println("Factorial : "+c);
	}
}