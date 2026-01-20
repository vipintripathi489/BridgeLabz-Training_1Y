import java.util.Scanner;
class Unit
{
	public static void main(String args[])
	{
		Scanner space = new Scanner(System.in);
		System.out.print("Unit_price : ");
		int a = space.nextInt();
		System.out.print("Quantity : ");
		int b = space.nextInt();
		System.out.println("Total amount : " +(a * b));
	}
}