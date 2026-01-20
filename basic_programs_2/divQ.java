import java.util.Scanner;
class DivQ
{
	public static void main(String args[])
	{
		Scanner space = new Scanner(System.in);
		System.out.print("First_number : ");
		int a = space.nextInt();
		System.out.print("Second_number : ");
		int b = space.nextInt();
		System.out.println("Remainder ; " +(a%b));
		System.out.println("Quotient : " +(a/b));
	}
}