import java.util.Scanner;
class Number
{
	public static void main(String srgs[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		if (b > 0)
		{
			System.out.println("Given_number_is_positive.");
		}
		else if (b < 0)
		{
			System.out.prinln("Given_number_is_negative.");
		}
		else
		{
			System.out.println("Given_number_is_zero.");
		}
	}
}