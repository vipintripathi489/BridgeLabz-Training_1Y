import java.util.Scanner;
class summm
{
	public static void main(String args[])
	{
		double c;
		double d = 0;
		Scanner a = new Scanner(System.in);
		double b = a.nextInt();
		while (b != 0)
		{
			c = a.nextInt();
			if (c == 0 || c < 0)
			{	
				break;
				
			}
			else
			{
				d += c;
			}
		}
		System.out.println("Loop_been_terminated_and_sum_of_all_the_values_of_the_number_taken_is : "+(d + b));
	}
}