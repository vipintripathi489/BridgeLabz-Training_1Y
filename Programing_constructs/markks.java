import java.util.Scanner;
class marks
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Enter_your_marks : ");
			int b = a.nextInt();
			System.out.print("Your_grade : ");
			if (b < 50)
			{
				System.out.println("Fail!");
			}
			else if (b >= 50 && b < 60)
			{
				System.out.println("D");
			}
			else if (b >= 60 && b < 70)
			{
				System.out.println("C");
			}
			else if (b >= 70 && b < 80)
			{
				System.out.println("B");
			}
			else if (b >= 80 && b < 90)
			{
				System.out.println("A");
			}
			else if (b >= 90 && b < 100)
			{
				System.out.println("S");
			}
			else
			{
				System.out.println("Invalid Input");
			}
		}
	}
}