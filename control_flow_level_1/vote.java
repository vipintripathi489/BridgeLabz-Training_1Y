import java.util.Scanner;
class Vote
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		System.out.print("Enter_age : ");
		int b = a.nextInt();
		if (b >= 18)
		{
			System.out.println("You_can_vote.");
		}
		else
		{
			System.out.println("You_can't_vote.");
		}
	}
}