import java.util.Scanner;
class Operator
{
	public static void main(String args[])
	{
		Scanner apple = new Scanner(System.in);
		System.out.print("Enter_first_number : ");
		int a = apple.nextInt();
		System.out.print("Enter_second_number : ");
		int b = apple.nextInt();
		System.out.print("Enter(1 for addition, 2 for subtractioin, 3 for division, 4 for multiplication) : ");
		int c = apple.nextInt();
		if(c == 1)
		{
			System.out.println("Sum : " +(a + b));
		}
		
		else
		{
			System.out.println("Invalid");
		}
	}
}