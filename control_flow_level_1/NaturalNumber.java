import java.util.Scanner;
class NaturalNumber
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		if (b > 0)
		{
			int n = b * (b + 1)/2;
			System.out.println("The_sum_of "+b+"natural_numbers : "+n);
		}
		else
		{
			System.out.println("Given_number_isn't_nartural");
		}
	}
}