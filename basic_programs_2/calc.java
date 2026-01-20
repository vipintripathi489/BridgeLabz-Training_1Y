import java.util.Scanner;
class Calc
{
	public static void main(String args[])
	{
		Scanner space = new Scanner(System.in);
		System.out.print("Enter_first_number : ");
		double a = space.nextDouble();
		System.out.print("Enter_second_number : ");
		double b = space.nextDouble();
		System.out.println("Summation : "+(a + b));
		System.out.println("Difference : "+(a - b));
		System.out.println("Multiplication : "+(a * b));
		System.out.println("Division : "+(a/b));
	}
}