import java.util.Scanner;
class Harry
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Birth_year : ");
		int a = input.nextInt();
		System.out.print("Current_year : ");
		int b = input.nextInt();
		int age = b - a;
		System.out.println("Age : "+age);
	}
}