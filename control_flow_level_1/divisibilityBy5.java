import java.util.Scanner;
class divisibilityBy5
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter_number_here : ");
		int b = a.nextInt();
		if (b % 10 == 5)
		{
			System.out.println("Given_Number_is_divisible_by_5.");
		}
		else
		{
			System.out.println("Given_Number_isn't_divisible_by_5.");
		}
	}
}