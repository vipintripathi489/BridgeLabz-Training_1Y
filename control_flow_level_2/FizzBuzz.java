import java.util.Scanner;
class Fizzbuzz
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		if (b > 0 && b % 3 == 0)
		{
			
		
			if (b > 0 && b % 5 == 0)
			{
				
			
				if (b > 0 && b % 3 == 0)
				{
					System.out.println("FizzBuzz");
				}
				else
				{
					System.out.println("Buzz");
				}
			}
			else
			{
				System.out.println("Fizz");
			}
		}
	}
}